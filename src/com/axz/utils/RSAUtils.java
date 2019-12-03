package com.axz.utils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSAUtils {
    public static String url = RSAUtils.class.getResource("/").getPath();

    //    随机生成公钥和私钥
    public static KeyPair getKeyPair() {
        KeyPairGenerator keyPairGenerator = null;
        try {
            // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
//        初始化密钥生成器，密钥大小为96-1024位
        keyPairGenerator.initialize(1024, new SecureRandom());
//        生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        return keyPair;
    }

    /**
     * 将 公钥/私钥 编码后以 Base64 的格式保存到指定文件
     */
    public static void saveKey(Key key, File keyFile) {
        // 获取密钥编码后的格式
        byte[] encBytes = key.getEncoded();

        // 转换为 Base64 文本
        String encBase64 = Base64.getEncoder().encodeToString(encBytes);

        // 保存到文件
        IOUtils.writeFile(encBase64, keyFile);
    }

    /**
     * 根据私钥的 Base64 文本创建私钥对象
     */
    public static PrivateKey getPrivateKey() {
        String privateUrl = url + "privateKey";
        String privateKeyBase64 = IOUtils.readFile(new File(privateUrl));
        // 把 私钥的Base64文本 转换为已编码的 私钥bytes
        byte[] priKey = Base64.getDecoder().decode(privateKeyBase64);
        // 创建 已编码的私钥规格
        PKCS8EncodedKeySpec priKeySpec = new PKCS8EncodedKeySpec(priKey);
        // 获取指定算法的密钥工厂, 根据 已编码的私钥规格, 生成私钥对象
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(priKeySpec);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据公钥的 Base64 文本创建公钥对象
     */
    public static PublicKey getPublicKey() {
        String pubUrl = url + "publicKey";
        String pubKeyBase64 = IOUtils.readFile(new File(pubUrl));
        byte[] pubKey = Base64.getDecoder().decode(pubKeyBase64);
        // 创建 已编码的公钥规格
        X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(pubKey);
        // 获取指定算法的密钥工厂, 根据 已编码的公钥规格, 生成公钥对象
        try {
            return KeyFactory.getInstance("RSA").generatePublic(pubKeySpec);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 公钥加密数据
     */
    public static byte[] encryptByPublicKey(String data, PublicKey publicKey)
            throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] result = cipher.doFinal(data.getBytes("utf-8"));
        return result;
    }

    /**
     * 私钥解密数据
     */
    public static byte[] privateDecrypt(byte[] data, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] result = cipher.doFinal(data);
            return result;
        } catch (NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
//        保存公钥和私钥
        KeyPair keyPair = getKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        saveKey(privateKey, new File("src/privateKey"));
        saveKey(publicKey, new File("src/publicKey"));
        try {
//        获取公钥
            PublicKey getPublicKey = getPublicKey();
//        公钥加密
            String data = "你好, World!";
            byte[] encryptByPublicKey = encryptByPublicKey(data, getPublicKey);
            String in = new String(encryptByPublicKey);
            System.out.println(in);
            //获取私钥
            PrivateKey getPrivateKey = getPrivateKey();
//        私钥解密
            byte[] privateDecrypt = privateDecrypt(encryptByPublicKey, getPrivateKey);
            String out = new String(privateDecrypt);
            System.out.println(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.axz.utils;

import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;
import java.util.HashMap;

public class RSAUtils {
    //    随机生成公钥和私钥
    public static HashMap<String, String> getKeyPair() {

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
//        得到私钥
        PrivateKey privateKey = keyPair.getPrivate();
//        得到公钥
        PublicKey publicKey = keyPair.getPublic();
        try {
            // 得到私钥字符串
            String privateKeyString = Base64.getEncoder().encodeToString(privateKey.getEncoded());
            // 得到公钥字符串
            String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());
            HashMap<String, String> result = new HashMap<>();
            result.put("privateKey", privateKeyString);
            result.put("publicKey", publicKeyString);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 公钥加密
     */
    public static byte[] encryptByPublicKey(String data, PublicKey publicKey)
            throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] result = cipher.doFinal(data.getBytes("utf-8"));
        return result;
    }

    /**
     * 私钥解密
     */
    public static byte[] privateDecrypt(byte[] data, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] result = cipher.doFinal(data);
        return result;
    }
}

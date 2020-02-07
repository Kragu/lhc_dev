package security;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Crypting {
    private String id;
    private String name;

    public Crypting(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getAESPassword() throws Exception{
        byte[] bytes = (id).getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        bytes = sha.digest(bytes);
        bytes = Arrays.copyOf(bytes, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encrypted = cipher.doFinal(name.getBytes());
        String encryptedPassword = new String(encrypted);

        return encryptedPassword;
    }
    public String getMD5Password() throws Exception{
        byte[] bytes = (id).getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("MD5");
        bytes = sha.digest(bytes);
        String encryptedPassword = new String(bytes);
        return encryptedPassword;

    }
}

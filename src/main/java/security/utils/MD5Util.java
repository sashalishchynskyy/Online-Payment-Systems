package security.utils;

import org.apache.log4j.Logger;
import utils.ScannerTool;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    private static final Logger logger = Logger.getLogger(MD5Util.class);

    public static String getHashedPassword(String password) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            logger.error("Unexpected error", e);
        }
        messageDigest.reset();
        messageDigest.update(password.getBytes());
        byte[] digest = messageDigest.digest();
        BigInteger bigInt = new BigInteger(1, digest);
        String hashPassword = bigInt.toString(16);
        // Now we need to zero pad it if you actually want the full 32 chars.
        while (hashPassword.length() < 32) {
            hashPassword = "0" + hashPassword;
        }
        return hashPassword;
    }

    public static String getStringForPassword() {
        String passwordString;
        while (true) {
            passwordString = ScannerTool.getString();
            if (passwordString.matches("\\w{5,15}")) {
                logger.info("User input right data!");
                return passwordString;
            }
            System.out.println("Wrong input!");
            logger.warn("User input wrong data!");
        }
    }
}

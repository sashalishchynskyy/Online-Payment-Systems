package security.utils;

import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    private static final Logger logger = Logger.getLogger(MD5Util.class);

            logger.error("Unexpected error", e);
    public static String hashedString(String string) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(string.getBytes());
        byte[] digest = messageDigest.digest();
        BigInteger bigInt = new BigInteger(1, digest);
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

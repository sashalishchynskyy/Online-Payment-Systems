package security.rsa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RSATest {
    private String password;
    private byte[] cipherText;

    public RSATest(String password) {
        this.password = password;
    }

    @Parameters
    public static List<String> data() {
        return Arrays.asList("Password",
                "James Bond 007",
                "Java Security",
                "2018-Year");
    }

    @Test
    public void encryptTextRSATest() throws Exception {
        cipherText = RSA.encryptTextRSA(password);
    }

    @Test
    public void decryptCipherTextRSATest() throws Exception {
        encryptTextRSATest();
        String decryptPassword = new String(RSA.decryptCipherTextRSA(cipherText), "UTF8");
        assertEquals(password, decryptPassword);
    }
}
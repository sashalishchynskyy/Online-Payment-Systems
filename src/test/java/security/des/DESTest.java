package security.des;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DESTest {
    private String password;
    private byte[] cipherText;

    public DESTest(String password) {
        this.password = password;
    }

    @Parameters
    public static List<String> data() {
        return Arrays.asList("Password",
                "Java",
                "James Bond 007",
                "2018Years");
    }

    @Test
    public void encryptTextDESTest() throws Exception {
        cipherText = DES.encryptTextDES(password);
    }

    @Test
    public void decryptCipherTextTest() throws Exception {
        encryptTextDESTest();
        byte[] decryptBytePassword = DES.decryptCipherTextDES(cipherText);
        String decryptPassword = new String(decryptBytePassword, "UTF8");
        assertEquals(password, decryptPassword);
    }
}
package utils.scanner.menuScanner;

import utils.scanner.LoginScanner;
import utils.scanner.PasswordScanner;
import utils.scanner.ScannerTool;

import java.util.Arrays;
import java.util.List;

public class SignUpMenuScanner extends ScannerTool {

    public static List<String> getPasswordAndLogin() {
        System.out.println("Enter your login to Sign Up:");
        String login = LoginScanner.getLogin();

        System.out.println("Enter your password to Sign Up:");
        String password = PasswordScanner.getPassword();

        System.out.println("Your login: " + login +
                "\nYour password: " + password);
        return Arrays.asList(login, password);
    }
}

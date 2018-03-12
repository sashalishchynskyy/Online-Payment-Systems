package utils.scanner;

public class PasswordScanner extends ScannerTool {
    public static String getPassword() {
        String passwordString;
        while (true) {
            passwordString = ScannerTool.getString();
            if (passwordString.matches("\\w{5,15}")) {
                return passwordString;
            }
            System.out.println("Wrong input!");
        }
    }
}

package utils.scanner;

public class LoginScanner extends ScannerTool{
    public static String getLogin() {
        System.out.println("Enter your username");
        String login;
        while(true){
            login = getString();
            break;
        }
        return login;
    }
}

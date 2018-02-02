package utils.scanner;

public class LoginScanner extends ScannerTool{
    public static String getLogin() {
        String login;
        while(true){
            login = getString();
            break;
        }
        return login;
    }
}

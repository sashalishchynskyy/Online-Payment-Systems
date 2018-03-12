package menu;

import utils.scanner.menuScanner.SignUpMenuScanner;

import java.util.List;

public class SignUpMenu {

    /*
    Create Singleton
     */
    private static SignUpMenu signUpMenu;

    private SignUpMenu() {
    }

    static SignUpMenu getInstance() {
        if (signUpMenu == null) signUpMenu = new SignUpMenu();
        return signUpMenu;
    }

    public void start() {
        List<String> list = SignUpMenuScanner.getPasswordAndLogin();
        String login = list.get(0);
        String password = list.get(1);
    }
}

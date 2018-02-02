package menu;

import utils.scanner.SignInMenuScanner;
import view.SignInMenuView;

public class SignInMenu {
    /*
    Create Singleton
     */
    private static SignInMenu signInMenu = null;

    private SignInMenu() {
    }

    static SignInMenu getInstance() {
        if (signInMenu == null) signInMenu = new SignInMenu();
        return signInMenu;
    }

    public void start() {
        while (getLogin() && getPassword()) {

        }
    }

    private boolean getLogin() {
        SignInMenuView.printGetPassword();
//        return SignInMenuScanner.getLogin();
        return true;
    }

    private boolean getPassword() {
        SignInMenuView.printGetLogin();
//        return SignInMenuScanner.getPassword();
        return true;
    }
}

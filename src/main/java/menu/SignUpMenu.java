package menu;

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
    }
}

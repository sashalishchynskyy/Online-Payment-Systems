package menu;

import utils.scanner.menuScanner.StartMenuScanner;
import view.StartMenuView;

public class StartMenu {
    private SignInMenu signInMenu;
    private SignUpMenu signUpMenu;

    public void start() {
        StartMenuView.printStartMenu();
        chooseMenuOption();
    }

    private void chooseMenuOption() {
        System.out.println();
        switch (StartMenuScanner.getStartMenuOption()) {
            case 1:
                signInMenu = SignInMenu.getInstance();
                signInMenu.start();
                break;
            case 2:
                signUpMenu = SignUpMenu.getInstance();
                signUpMenu.start();
                break;
            case 3:
                exit();
        }
    }

    private void exit() {
        StartMenuView.printExit();
    }
}

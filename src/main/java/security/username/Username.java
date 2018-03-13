package security.username;

import utils.dataBaseConnect.JDBCUtil;
import utils.scanner.LoginScanner;

public class Username {
    private static String username;
    private final static String USERNAMES_TABLE = "usernames";
    private final static String USERNAME_COLUMN = "username";
    private final static String ID_COLUMN = "idUsername";


    public static void checkUsername() {
        username = LoginScanner.getLogin();
        if (getUsername() != null) {
            System.out.println("All right!");
        } else {
            System.out.println("Didn't find");
        }
    }

    public static String getUsername() {
        String query = "Select * FROM usernames WHERE username = '" + username + "'";

        return JDBCUtil.queryDatabase(query, USERNAME_COLUMN);
    }
}

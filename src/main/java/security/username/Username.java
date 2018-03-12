package security.username;

import utils.dataBaseConnect.JDBCUtil;
import utils.scanner.LoginScanner;

public class Username {
    private static String username;
    private final static String USERNAMES_TABLE = "usernames";
    private final static String USERNAME_COLUMN = "username";

    public static void checkUsername() {
        username = LoginScanner.getLogin();
//        if (getUsername()) {
//            System.out.println("All right!");
//        } else {
//            System.out.println("Didn't find");
//        }
    }

    public static String getUsername() {
        String columnLabel = "username";
        String query = "Select * FROM usernames WHERE idUsername = 1";

        return JDBCUtil.queryDatabase(query, columnLabel);
    }
}

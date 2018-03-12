package security.username;

import utils.dataBaseConnect.JDBCUtil;
import utils.scanner.LoginScanner;

import java.sql.ResultSet;
import java.sql.SQLException;

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

    public static String getUsername(ResultSet resultSet) throws SQLException {
        String s = null;
        while(resultSet.next()){
            s = resultSet.getString("username");
        }
        return s;
//        return JDBCUtil.queryDatabase("select * from " + USERNAMES_TABLE
//                + " where username = '" + username + "'", USERNAME_COLUMN);
    }
}

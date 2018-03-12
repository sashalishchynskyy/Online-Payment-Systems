package security.password;

import utils.scanner.PasswordScanner;

public class Password {
    private static String password;
    private String passwordTable = "passwords";

    public static void checkPassword(){
        password = PasswordScanner.getPassword();


    }

//    private String getPasswordDataBase(){
//        ConnectMySQL.queryDatabase("select idPassword from " + passwordTable
//                + " where password = " + password);
//        return null;
//    }
}

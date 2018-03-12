package main;

import security.username.Username;

import java.sql.SQLException;

import static utils.dataBaseConnect.JDBCUtil.queryDatabase;

public class MainTestClass {
//    public static void main(String[] args) throws Exception {
//        String password = "Password";
//        byte[] cipherText1 = DES.encryptTextDES("Password");
//        System.out.println(new String(cipherText1, "UTF8"));
//        byte[] cipherText2 = encryptTextRSA("Password");
//        byte[] cipherText3 = encryptTextRSA("password");
//
//        if (Arrays.equals(cipherText1, cipherText2)) System.out.println("cipherText1 == cipherText2");
//        else System.out.println("cipherText1 != cipherText2");
//
//        if (Arrays.equals(cipherText2, cipherText3)) System.out.println("cipherText2 == cipherText3");
//        else System.out.println("cipherText2 != cipherText3");
//
//        if (Arrays.equals(cipherText1, cipherText3)) System.out.println("cipherText1 == cipherText3");
//        else System.out.println("cipherText1 != cipherText3");
//
//        byte[] cipherText4 = decryptCipherTextRSA(cipherText1);
//        byte[] cipherText5 = decryptCipherTextRSA(cipherText2);
//        byte[] cipherText6 = decryptCipherTextRSA(cipherText3);
//    }

    public static void main(String[] args) throws SQLException {
        String table = "usernames";
//        System.out.println(queryDatabase("select * from " + table));
//
//        updateDatabase("update " + table + " set username = 'Mike' where idUsername = 1");
//        updateDatabase("INSERT INTO " + table + "(username) VALUES ('Hank')");
//        queryDatabase("select * from " + table + " where idUsername = 4");
//        System.out.println(queryDatabase("select * from " + table + " where idUsername = 4"));
        queryDatabase("Select * FROM " + table + " WHERE idUsername = 1");
//            Username.checkUsername();
//        closeConnection();
    }
}

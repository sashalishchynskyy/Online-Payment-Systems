package utils.dataBaseConnect;

import java.sql.*;

public class ConnectMySQL {
    private static Connection connection = null;
    private static Statement statement = null;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String CONN_STRING =
            "jdbc:mysql://127.0.0.1:3306/users_data";

}
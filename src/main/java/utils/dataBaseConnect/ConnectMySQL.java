package utils.dataBaseConnect;

import java.sql.*;

public class ConnectMySQL {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String CONN_STRING =
            "jdbc:mysql://127.0.0.1:3306/users_data";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
    }
}

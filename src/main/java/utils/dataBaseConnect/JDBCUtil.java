package utils.dataBaseConnect;

import security.username.Username;

import java.sql.*;

public class JDBCUtil {

    public static void queryDatabase(String query) {
        try (Connection connection = ConnectMySQL.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            System.out.println(Username.getUsername(resultSet));
        } catch (SQLException e) {
            DataBaseUtil.processException(e);
            e.printStackTrace();
        }
    }

    public static void updateDatabase(String updates) {
        try (Connection connection = ConnectMySQL.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(updates);
        } catch (SQLException e) {
            DataBaseUtil.processException(e);
        }
    }

    private static void loadJDBCDriver() {
        try {
            Class.forName("com.sql.mysql.jdbc");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
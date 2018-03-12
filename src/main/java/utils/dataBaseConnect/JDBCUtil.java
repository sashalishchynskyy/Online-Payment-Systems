package utils.dataBaseConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

    public static String queryDatabase(String query, String columnLabel) {
        try (Connection connection = ConnectMySQL.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            StringBuffer buffer = null;
            while (resultSet.next()) {
                buffer = new StringBuffer();
                buffer.append(resultSet.getString(columnLabel));
            }
            if (buffer != null) {
                return buffer.toString();
            }
        } catch (SQLException e) {
            DataBaseUtil.processException(e);
            e.printStackTrace();
        }
        return null;
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
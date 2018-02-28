package utils.dataBaseConnect;

import java.sql.*;

public class ConnectMySQL {
    private static Connection connection = null;
    private static Statement statement = null;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String CONN_STRING =
            "jdbc:mysql://127.0.0.1:3306/users_data";

    public static void main(String[] args) throws SQLException {
        openConnection();
        createStatement();
        ResultSet resultSet = null;
        try {
            String sql = "select * from usernames";
            resultSet = getResultSet(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("username");
                System.out.println("Rows:" + name);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (resultSet != null) resultSet.close();
            closeConnection();
        }
    }

    public static ResultSet getResultSet(String query) {
        try {
            return statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void openConnection() {
        try {
            connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void closeConnection() {
        try {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createStatement() {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
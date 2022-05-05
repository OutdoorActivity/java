package JDBC;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
  try (Connection connection = DriverManager.getConnection("jdbc:<db_url>", "<username>", "<password>");
     PreparedStatement preparedStatement = connection.prepareStatement("<changeme>")) {
      // ... add parameters to the SQL query using PreparedStatement methods:
      //     setInt, setString, etc.
      try (ResultSet resultSet = preparedStatement.executeQuery()) {
          while (resultSet.next()) {
              // ... do something with result set
          }
      }
  } catch (SQLException e) {
      // ... handle SQL exception
  }
    }
}


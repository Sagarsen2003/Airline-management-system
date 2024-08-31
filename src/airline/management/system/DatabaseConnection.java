

package airline.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private Connection connection;
    private Statement statement;

    public DatabaseConnection() {
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsystem", "root", "Sagar@2003");

           
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    
    public Connection getConnection() {
        return connection;
    }

    
    public Statement getStatement() {
        return statement;
    }

  
    public void close() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

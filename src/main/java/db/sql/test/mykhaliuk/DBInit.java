package db.sql.test.mykhaliuk;

import org.testng.annotations.BeforeMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DBInit {

    public static final String USER_NAME = "root";
    public static final String USER_PASS = "Root123321";
    public static final String URL = "jdbc:mysql://localhost:3306/store";
    public static Connection connection;
    public static Statement statement;

    @BeforeMethod
    public void setup() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER_NAME, USER_PASS);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

}



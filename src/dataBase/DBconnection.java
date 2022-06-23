package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static DBconnection dBconnection;
    private Connection connection;

    private DBconnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/group11","root","mysql");
    }

    public static DBconnection getInstance() throws SQLException, ClassNotFoundException {
        return dBconnection = (dBconnection == null) ? new DBconnection() : dBconnection;
    }

    public Connection getConnection() {
        return connection;
    }
}

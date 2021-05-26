package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Config {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost +
                " : " + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void signUpUser(Student student) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USERS_FIRSTNAME +
                "," + Const.USERS_LASTNAME + "," + Const.USERS_ID + ","
                + Const.USERS_SPECIALTY + "," + Const.USERS_GENDER + ")" +
                "VALUES(?,?,?,?,?)";


        try {
            PreparedStatement prST = getDbConnection().prepareStatement(insert);
            prST.setString(1, student.getFirstName());
            prST.setString(2, student.getLastName());
            prST.setString(3, student.getIdStudent());
            prST.setString(4, student.getStudentSpecialty());
            prST.setString(5, student.getGender());
            prST.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

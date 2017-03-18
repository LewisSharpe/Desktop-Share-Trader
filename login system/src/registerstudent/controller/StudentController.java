/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerstudent.controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import registerstudent.model.Student;

/**
 *
 * @author CLOUD_ATLAS
 */
public class StudentController {

    public static int addStudent(Student student) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "");

        String query = "INSERT INTO user VALUES ('" + student.getname() + "','" + student.getemail() + "','" + student.getusername() + "','" + student.getpassword() + "','" + student.getmembershiptype() + "')";

        Statement stm = connection.createStatement();

        int executeUpdate = stm.executeUpdate(query);

        return executeUpdate;
    }
}

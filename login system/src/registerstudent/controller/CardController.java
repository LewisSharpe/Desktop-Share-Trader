/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerstudent.controller;

import registerstudent.controller.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import registerstudent.model.Card;

/**
 *
 * @author CLOUD_ATLAS
 */
public class CardController {

    public static int addStudent(Card card) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "");

        String query = "INSERT INTO cards VALUES ('" + card.getcompanyname() + "','" + card.getcardtype() + "','" + card.getcardno() + "','" + card.getname() + "','" + card.getexpirydate() + "')";

        Statement stm = connection.createStatement();

        int executeUpdate = stm.executeUpdate(query);

        return executeUpdate;
    }
}

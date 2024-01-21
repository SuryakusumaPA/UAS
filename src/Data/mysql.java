/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Nibras A. A
 */
public class mysql {
    Connection connect;
    public static Connection openKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/form_order", "root", "");
            return connect;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.LoginController.DoctorLogin;
import static Controller.LoginController.ReceptionLogin;
import Model.DBConnection;
import Model.DBSearch;
import View.DoctorHome;
import View.DoctorLogin;
import View.ReceptionHome;
import View.ReceptionLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dasun_weerawardhana
 */
public class LoginController {
    
    public static void ReceptionLogin(String Username, String pass){
        try {
            String username = null; // initial value of the username
            String password = null; // initial value of the password
 
            ResultSet rs =new DBSearch().RecepLogin(Username);
            //Process the Query
            while (rs.next()) {
            username = rs.getString("UserName"); //assign database login name to the variable
            password = rs.getString("Password"); //assign database password to the variable
            }
 
            if (username != null && password != null) {
                if (password.equals(pass)) {
 
                    System.out.println("Login Successfull");
                   ReceptionLogin.getFrames()[0].dispose();
                    new ReceptionHome().setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Username & Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Username & Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
    
        DBConnection.closeCon();
        } catch (SQLException ex){
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void DoctorLogin(String Username, String pass){
        try {
            String username = null; // initial value of the username
            String password = null; // initial value of the password
 
            ResultSet rs =new DBSearch().DoctorLogin(Username);
            //Process the Query
            while (rs.next()) {
            username = rs.getString("UserName"); //assign database login name to the variable
            password = rs.getString("Password"); //assign database password to the variable
            }
 
            if (username != null && password != null) {
                if (password.equals(pass)) {
 
                    System.out.println("Login Successfull");
                    DoctorLogin.getFrames()[0].dispose();
                    new DoctorHome().setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Username & Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Username & Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
    
        DBConnection.closeCon();
        } catch (SQLException ex){
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

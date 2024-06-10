/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author dasun_weerawardhana
 */
public class InsertController {
    
    public static void InsertRecepDetails(String RName, String RNIC, String Contact, String UserName, String Pw1, String Pw2){
   
        if(Pw1.equals(Pw2)){
            int Tele = Integer.parseInt(Contact);
            new Model.AddRecord().AddRecepDetails(RName, RNIC, Tele , UserName, Pw2);
            JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "Passwords don't match", "Message",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
 
    
    public static void InsertDoctorDetails(String DName,String DNIC,String DReg,String DEligibility,String special,String DContact,String DUser,String DPassword,String DConfirm){
        
        
        if(DPassword.equals(DConfirm)){
            int Tele = Integer.parseInt(DContact);
            new Model.AddRecord().AddDoctorDetails(DName,DNIC,DReg,DEligibility,special,Tele,DUser,DConfirm);
            JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "Passwords don't match", "Message",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    
    public static void InsertPatient(String FName, String LName, String NIC, String BDay, String Gender, String Address, String Contact, String Btype){
        
        int Tele = Integer.parseInt(Contact);
        new Model.AddRecord().AddPatient( FName, LName, NIC, BDay, Gender, Address, Tele, Btype);
        JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);

    }
    
    
    public static void InsertChannelling(String Name, String NIC, String clinic, String Date, String Time, String Amount){
        
        new Model.AddRecord().AddChannelling( Name, NIC, clinic, Date, Time, Amount);
        JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);

    }
    
    
}

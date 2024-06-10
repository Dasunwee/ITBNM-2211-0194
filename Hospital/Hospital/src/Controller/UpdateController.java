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
public class UpdateController {
    
    public static void UpdatePatient(String NIC1, String FName,String LName,String NICNew,String BDay,String Gender,String Btype,String Address,String Contact){
        
        int Tele = Integer.parseInt(Contact);
        new Model.UpdateRecord().UpdatePatient(NIC1, FName, LName,NICNew, BDay, Gender, Address, Tele, Btype);
        JOptionPane.showMessageDialog(null, "Details has been updated", "Successful",JOptionPane.INFORMATION_MESSAGE);
        
    
    
    }
    
}

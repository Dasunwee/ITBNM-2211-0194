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
public class DeleteController {
    
    public static void DeletePatient(String NIC){
                  
        new Model.DeleteRecord().DeletePatient(NIC);
        JOptionPane.showMessageDialog(null, "Customer has been deleted", "Successful",JOptionPane.INFORMATION_MESSAGE);

    }
}

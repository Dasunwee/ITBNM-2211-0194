/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dasun_weerawardhana
 */
public class DeleteRecord {
    
    Statement stmt;
    
    public void DeletePatient(String NIC){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM patientdetails WHERE NIC='"+NIC+"' ");
        }
        catch(SQLException e){
        }
    
    }
    
}

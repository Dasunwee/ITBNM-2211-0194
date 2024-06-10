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
public class UpdateRecord {
    
    Statement stmt;
    
    public void UpdatePatient(String NIC1, String FName,String LName,String NICNew,String BDay,String Gender,String Address,int Contact,String Btype){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("Update patientdetails SET FirstName='"+FName+"',LastName='"+LName+"',NIC='"+NICNew+"',BirthDay='"+BDay+"',Gender='"+Gender+"',Address='"+Address+"',Contact='"+Contact+"',BloodType='"+Btype+"' WHERE NIC='"+NIC1+"' ");
        }
        catch(SQLException e){
        }
    }
    
}

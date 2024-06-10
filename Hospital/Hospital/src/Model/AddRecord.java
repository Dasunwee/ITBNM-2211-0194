
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import Model.DBConnection;

public class AddRecord {
    
    Statement stmt;
    
    public void AddRecepDetails(String RName,String RNIC, int RContact,String UserName,String pass){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO receptiondetails VALUES('"+RName+"','"+RNIC+"','"+RContact+"','"+UserName+"','"+pass+"')");
        }
        catch(SQLException e){
        }
    }
    
    public void AddRecepLogin(String UName,String pw){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO receptionlogin VALUES('"+UName+"','"+pw+"')");
        }
        catch(SQLException e){
        }
    }
    public void AddDoctorDetails(String DName,String DNIC,String DReg,String Eligibility, String special, int Contact,String Username, String password){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO doctordetails VALUES('"+DName+"','"+DNIC+"','"+DReg+"','"+Eligibility+"','"+special+"','"+Contact+"', '"+Username+"', '"+password+"')");
        }
        catch(SQLException e){
        }
    }
    
    public void AddDoctorLogin(String UName,String pw){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO doctorlogin VALUES('"+UName+"','"+pw+"')");
        }
        catch(SQLException e){
        }
    }
    
    
    public void AddPatient( String FName, String LName, String NIC, String BDay, String Gender, String Address, int Contact,String Btype){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO patientdetails VALUES('"+FName+"','"+LName+"','"+NIC+"','"+BDay+"','"+Gender+"','"+Address+"','"+Contact+"','"+Btype+"')");
        }
        catch(SQLException e){
        }
    }
    
    
    public void AddChannelling(String Name, String NIC, String clinic, String Date, String Time, String Amount){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO channelling VALUES('"+Name+"','"+NIC+"','"+clinic+"','"+Date+"','"+Time+"','"+Amount+"')");
        }
        catch(SQLException e){
        }
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dasun_weerawardhana
 */
public class DBSearch {
    
    Statement stmt;
    ResultSet rs;

    
    public ResultSet RecepLogin(String username) {
      try{
          stmt=DBConnection.getStatementConnection();
          String UserName = username ;
          rs=stmt.executeQuery("SELECT*FROM receptiondetails WHERE UserName='"+UserName+"'");
    }
      catch(SQLException e){
    }
                  return rs;
    }
    public ResultSet DoctorLogin(String username) {
      try{
          stmt=DBConnection.getStatementConnection();
          String UserName = username ;
          rs=stmt.executeQuery("SELECT*FROM doctordetails WHERE UserName='"+UserName+"'");
    }
      catch(SQLException e){
    }
                  return rs;
    }
    
    
    public ResultSet SearchPatient(String NIC) {
      try{
          stmt=DBConnection.getStatementConnection();
          String ID = NIC ;
          rs=stmt.executeQuery("SELECT * FROM patientdetails WHERE NIC='"+ID+"' ");
        }
        catch(SQLException e){
        }
    return rs;
    }
    public ResultSet SearchDoctor(String RegNo) {
      try{
          stmt=DBConnection.getStatementConnection();
          String ID = RegNo ;
          rs=stmt.executeQuery("SELECT * FROM doctordetails WHERE RegNo='"+ID+"' ");
        }
        catch(SQLException e){
        }
    return rs;
    }
    
    public ResultSet SearchHistory(String NIC) {
      try{
          stmt=DBConnection.getStatementConnection();
          String ID = NIC ;
          rs=stmt.executeQuery("SELECT * FROM channelling WHERE NIC='"+ID+"' ");
        }
        catch(SQLException e){
        }
    return rs;
    }
    
    public ResultSet SearchAllDoc() {
      try{
          stmt=DBConnection.getStatementConnection();
          
          rs=stmt.executeQuery("SELECT * FROM doctordetails ");
        }
        catch(SQLException e){
        }
    return rs;
    }
    
    
    public ResultSet SearchClinic(String clinic) {
      try{
          stmt=DBConnection.getStatementConnection();
          
          rs=stmt.executeQuery("SELECT * FROM channelling WHERE Clinic='"+clinic+"'  ");
        }
        catch(SQLException e){
        }
    return rs;
    }
 
        
}

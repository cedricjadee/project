/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author clyde
 */
public class dbConnector {
    
    private Connection connect;
    static Statement stmt;
    
    public dbConnector(){
        
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment_db", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
    public ResultSet getData(String sql) throws SQLException{
            stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
    
   

    public boolean insertData(String sql){
        try{
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            pst.close();
            return true;
        }catch(SQLException ex){
            System.out.println("Connection Error:"+ex);
            return false;
        }
    }
    
    
    public void updateData(String sql){
        
        try{
            PreparedStatement pst = connect.prepareStatement(sql);
            int rowsUpdated = pst.executeUpdate();
            if(rowsUpdated > 0){
                JOptionPane.showMessageDialog(null,"Data Updated Succesfully!");
            }else{
                System.out.println("Data Update Failed!");
            }
            pst.close();
        }catch(SQLException ex){
            System.out.println("Connection Error:"+ex);
        }
    }
    
    public void deleteData(int id, String table){
        try{
            PreparedStatement pst = connect.prepareStatement("DELETE FROM tbl_user WHERE u_id = ?");
            pst.setInt(1,id);
            int rowsDeleted = pst.executeUpdate();
                if(rowsDeleted > 0){
                    JOptionPane.showMessageDialog(null,"Data Deleted Succesfully!");
                }else{
                    System.out.println("Data Delete Failed!");
                }
                pst.close();
        }catch(SQLException ex){
            System.out.println("Connection Error:"+ex);
        }
    }
    
    
}

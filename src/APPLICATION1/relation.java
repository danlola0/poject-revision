/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APPLICATION1;

import java.sql.*;

/**
 *
 * @author ckk
 */
public class relation {
 Connection con;
 
 
 public Connection getrelation(){
      try {
         
  Class.forName("com.mysql.jdbc.Driver");
  
  con=DriverManager.getConnection("jdbc:mysql://localhost/connection","root","");
          System.out.println("connection reussit");
          return con;
         
     } catch (ClassNotFoundException | SQLException e) {
         
          System.out.println("pas de connection "+e);    
         
     }
      return null;
    
     
 }
 
 
    
    
    
}

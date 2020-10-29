/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;

/**
 *
 * @author ckk
 */
public class BD {
    
Connection con;


public Connection getBD(){
    
    try {
   Class.forName("com.mysql.jdbc.Driver");
   
   con=DriverManager.getConnection("jdbc:mysql://localhost/exo","root","");
        System.out.println("la connexion reussit");
        return con;
   
        
        
        
    } catch (ClassNotFoundException | SQLException e) {
        System.err.println("pas de connexion"+e);
        
    }
    
    return null;
    
    
    
    
    
}

    
    
    
}

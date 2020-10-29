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
public class NewClass {
    static Connection con;
    static relation z=new relation();
    
    public static void main(String[] args) {
        
        con=z.getrelation();
        
    }
    
    
}

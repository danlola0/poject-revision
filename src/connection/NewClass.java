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
public class NewClass {
static Connection con;
static Statement sta;
static PreparedStatement pre;
static ResultSet re;

static BD a=new BD();

    public static void main(String[] args) {
       afficher() ;
    // Enregistre("pania","likengo","flo");
  //supprimer(1);
    }
    
    
    public static void afficher(){
        con=a.getBD();
        try {
    String sql="SELECT* FROM x ";
   sta=con.createStatement();
  re= sta.executeQuery(sql);
  while(re.next()){
      System.out.println("\n nom :"+re.getString("nom"));
      System.out.println("\n postnom :"+re.getString("postnom"));
      System.out.println("\n prenom:"+re.getString("prenom"));
      
      
      
  }
  
            
            
            
        } catch (Exception e) {
            System.err.println("erreur"+e);            
        }
        
        
        
        
    }
    
    
    public static void Enregistre(String nom,String postnom,String prenom){
               con=a.getBD();
        try {
            
        String sql="INSERT INTO x values(null,'"+nom+"','"+postnom+"','"+prenom+"')";
        pre=con.prepareStatement(sql);
        pre.executeUpdate();
            System.out.println("L'enregistrement reussi");
        
          } catch (Exception e) {
              
              System.err.println("pas d'enregistrement "+e);
              
      }
        
        
        
    }

    
    public static void supprimer(int id){
        
        
                       con=a.getBD();

        
        try {
            
            
              String sql="DELETE FROM X WHERE id="+id;
         pre=con.prepareStatement(sql);
         pre.executeUpdate();
            System.out.println("La suppression reussi");
    
    
    
        } catch (Exception e) {
            System.out.println("pas suppression "+e);
            
            
        }
        
        
        
        
    }
    
}

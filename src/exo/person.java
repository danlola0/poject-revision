/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo;

/**
 *
 * @author ckk
 */
public class person {
 protected   String nom;
 protected   String prenom;
    
    
public person(){
    System.out.println("parametre par defaut");  
    
    
}
    public person(String a,String b){
        
        System.out.println("constructeur  avec de parametre"); 
        nom=a;
        prenom=b;
        
        
    }
    public String getnom(){
      return nom;
    }
    public String getprenom(){
        return prenom;
    }
   public void  setnom(String a){
  nom=a; 
       
       
   }
   
   public void setprenom(String b){
    prenom=b;   
       
       
   }
  public String dan(){
      
      
  return "\n nom :"+getnom()+"\npostnom :"+getprenom();
  } 
   
}
    


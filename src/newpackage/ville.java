/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author ckk
 */
public class ville {
 
  public   String nom;
  public   String pays;
  public   int habitant;
    
 public  ville(){
     System.out.println("creation de construicteur par defaut");
     
 }   
 public ville(String a,String b,int c){
     
     System.out.println("creation de contruicteur avec parametre");
    nom=a;
    pays=b;
    habitant=c;
     }
public String  getnom(){
    return nom;
}

public String getpays(){
    return pays;
}
public int gethabitant(){
    return habitant;
}
public void setnom(String a){
 nom=a;   
    
    
    
}
public void setpays(String b){
    
  pays=b;
            
}
public void sethabitant(int c){
    habitant =c;
}

public String montre(){
    return "\n nom :"+getnom()+"\n pays:"+getpays()+"\n nombre habitant :" +gethabitant();
}
 
    
    
}

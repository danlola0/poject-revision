/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author ckk
 */
public class Etudiant {

 protected  String nom;
 protected String postnom;
protected int age;
  
public Etudiant(){
    //creation de  construicteur sans parametre , permet de d'initialiser le variable d'insatnce 
System.out.println("contruicteur sans de modifier");
    
}
public Etudiant(String a,String b,int c){
    System.out.println("creation de construicteur avec de parametre");
   nom=a;
   postnom=b;
   age=c;
    
}
public String getnom(){
    return nom;
}
public String getpostnom(){
    return postnom;
}
public int getage(){
    
   return age; 
   
}
public void setnom(String a){
   nom=a; 
    
}
 public void setpostnom(String b){
 postnom=b;    
     
 }
 public void setage(int c){
 age=c;       
        
    }
 public String da(){
     
   return "`\n nom :"+getnom()+"\n postnom :"+getpostnom()+"\n age :"+getage();  
     
     
 }
 
 
    
}

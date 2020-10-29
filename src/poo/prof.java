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
public class prof extends Etudiant{
 private String cours;

 public prof(){
     super();
     System.out.println("constructeur par defaut");
 }
 public prof(String a,String b,int c,String d){
 System.out.println("creation de constructeur avec de parametre");
 super.nom=a;
 super.postnom=b;
 super.age=c;
 this.cours=d;
 }
 public String dan(){
  return super.da()+"\n cours :"+this.cours;
     
     
 } 
    
    
    
}

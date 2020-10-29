/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methode;

import java.util.Scanner;

/**
 *
 * @author ckk
 */
public class NewClass {
    
    public static void main(String[] args) {
        // majuscule();
      //  affiche("salut dan");
        //miniscule();
       // taille();
        //compare();
       // extraire();
     //   extraire();
        position();
        
          }
    
   public static void majuscule(){
    Scanner lola=new Scanner(System.in);
    String nom;
       System.err.println("Entre le nom en majuscule");
       nom=lola.nextLine();
       nom=nom.toLowerCase();
       System.out.println("voici votre nom en miniscule  :"+nom);
       
       
       
   }
   public static void affiche(String n){
       System.out.println(n);  
       
   }
   public static void miniscule(){
      Scanner lola=new Scanner(System.in);
      String a;
       System.err.println("Entre le nom en miniscule");
       a=lola.nextLine();
       a=a.toUpperCase();
       System.out.println("voici le nom en majuscule"+a);
       
       
       
   }
  
   public static void taille(){
String nom="daniel yongo lola";
       System.out.println("la taille de la chaine est  :"+nom.length());

   }
   public static void compare(){
   Scanner lola=new Scanner(System.in);
   String a;
   String b;
       System.err.println("Entre la chaine num 1");
       a=lola.nextLine();
       System.out.println("Entre la deuxieme ");
       b=lola.nextLine();
  if(a.equals(b)){
      System.out.println("les deux chaine sont egeaux ");
  }     else{
      System.out.println("les deux chaine n'est sont pas egeaux");
  }
       
       
   }
   
   public static void extraire(){
// Scanner lola=new Scanner(System.in);
 String c="yongo lola ";
       System.out.println(""  +c.substring(1, 3));
    
       
       
   }
    public static void position(){
 String  da="yongo lola";
 int n=0;
 
n=da.indexOf('l');
        System.out.println(" "+n);
        
        
      
        
        
        
    }
   
    
    
     
      
      
 
  }
  
    


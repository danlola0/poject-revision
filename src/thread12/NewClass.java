/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread12;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ckk
 */
public class NewClass {
    
    public static void main(String[] args) {
//     
//    Scanner lola= new Scanner(System.in);
//        String dan []=new String[5];
//        
//       for(int i=0;i<=4;i++){
//      System.out.println("Entrez le nom");   
//      dan[i]=lola.nextLine();
//           
//       }
//       
//       for(String elt:dan){
//           
//           System.out.println(elt);
//           
//       }
//        Scanner lola=new Scanner(System.in);
//        int n,pg,pp;
//      pg=0;
//      
//    for(int i=1;i<=5;i++){
//        System.out.println("Entrez le nombre");
//     n=lola.nextInt();
//     
//     if(i==1||n>pg){
//      pg=n;
//      pp=i;
//         System.out.println("le nombre le plus grang est "+pg);
//         System.out.println("il etait saisi a la position  "+pp);
//     }
//     
//        
//        
////    }  
////     
// 
//    int A[]={2,4,5};
//        System.out.println(A[0]+A[2]);
////    
//        Scanner lola=new Scanner(System.in);
//        int A[]=new int [5];
//        int pg,pp;
//        int i;
//        pg=1;
//        
//        
//   for( i=0;i<=3;i++){
//       System.out.println("Entrez le nombre ");
//       A[i]=lola.nextInt();
//      } 
//   if(i==0||A[i]>=pg){
//      pg=A[i];
//      pp=i;
//       System.out.println("le plus grang nombre est "+pg);
//       System.out.println("la position est "+pp);
//      
//       
//       
//   }
//        Scanner lola=new Scanner(System.in);
//        int pg,p,i,n;
//        pg=0;
//        
//    for(i=1;i<=5;i++){
//        
//        System.out.println("Entrez le nombre ");
//         n=lola.nextInt();
//      if(i==1|| n>pg){
//       pg=n;
//       p=i;
//       
//       
//          System.out.println("le plus grand element est "+pg);
//          System.out.println("la position :" +p);
//    }
//   
//        
//    }
        
//        String s[] ={"bonjour","comment"};
//        String f[]={"salut","bien et toi"};
//        
//        
//        for(int i=0;i<2;i++){
//        System.out.println(""+s[i]);    
//
//            try {
//               Thread.sleep(5000);
//                
//            } catch (Exception e) {
//                System.out.println(""+e);
//            }
//            System.out.println(""+f[i]);
//            
//        }
//    
    
   // Th();
           mela();
        
  }
 
// public static void Th(){
// 
// new Thread (()->{
//String A[]={"salut","Comment"};
//String B[]={"bonjour","bien bien et toi"};
//for(int i=0;i<2;i++){
//    System.out.println(""+A[i]);
//    try {
//        Thread.sleep(3000);
//        
//        
//    } catch (Exception e) {
//        System.out.println(""+e);
//    }
//    System.out.println(""+B[i]);
//    
//    
//}
//
//     
// }).start();
//     
     
 public static void mela(){
 
     Timer b=new Timer();
     b.schedule(new TimerTask() {

         @Override
         public void run() {
       String A[]={"bonjour","comment"};
       String B[]={"salut","bien bien et toi"};
             
       for(int i=0;i<2;i++){
           System.out.println(""+A[i]);
           
           try {
               
               Thread.sleep(3000);
               
           } catch (Exception e) {
               System.out.println(""+e);
           }
           System.out.println(""+B[i]);
           
       }      
             
         }
     }, 0);
     
     
     
 }
    
    
     
 }     


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ckk
 */
public class NewClass {
    
    public static void main(String[] args) {
     List l=new ArrayList();
     l.add(123);
     l.add("daniel");
     
     for(int i=0;i<l.size();i++){
         
         System.out.println(""+l.get(i));    
         
     }
     
     
        
    }
      public static void dan(String n){
 List a=new ArrayList();
 a.add("daniel");
 a.add(25);
 
  for(int i=0;i<a.size();i++){
      
      System.out.println(""+a.get(i));    
      
  }
 
          
     }
      
    
}

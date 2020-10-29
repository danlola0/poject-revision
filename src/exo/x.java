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
public class x extends person{

public int age ;

public x(){
        super();

    System.out.println("");
}

public x(String a,String b,int c){
    
 super.nom=a;
 super.prenom=b;
 this.age=c;
 
    
    
    
}
public String dan(){
 return super.dan()+"\n age :"+this.age;
    
    
}

    
    
    
    
    
    
}

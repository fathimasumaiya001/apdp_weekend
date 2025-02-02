/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apdp6365;

/**
 *
 * @author N O V A
 */
public class Apdp6365 {

   
     
    public static void main(String[] args) {
       Apdp6365 tot55=new Apdp6365();
       tot55.sum(25,25);
       tot55.sub(10,5);
       tot55.details("fathima",22,"HNDIT");
    }
    
    public void sum(int a,int b){
       
        int total =a+b;
        System.out.println("total is "+ total );
    }
    
    public void sub(int a, int b ){
        
       
        int total =a-b;
        System.out.println("subtraction is "+total );
    }
    public void details(String name,int age,String course){
          System.out.println("name is"+ name);
          System.out.println("age is"+age);
          System.out.println("course is"+course);
               
        
    }
    
    
}
 
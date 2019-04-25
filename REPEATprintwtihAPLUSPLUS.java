/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamRevision;

/**
 *
 * @author Ramithaa Pillay
 */
public class REPEATprintwtihAPLUSPLUS {
    
    public static void main (String [] args) {
        
     for(int i=1;i<=5;i++)
            System.out.println("The number " + i++);   // if put i++ for this at the end, it will print uneven numbers
     
     for(int i=2;i<=5;i++)
            System.out.println("The number " + i++);   // if put i++ for this at the end, it will print even numbers
      
     // the i=3 means it will start from number 3
     // the i<=5 means that the number will increase one till it reaches number 5
     // the i++ is to plus one from the previous number
     
      int j=1;
        while(j<=5){
            System.out.println("Hello World while " + j++);
        }
        
        int k=1;
        do{
            System.out.println("Hello World do-while " + k++);
        }while(k<=5);
     
      
         
         
         
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamRevision;

import java.util.Scanner;

/**
 *
 * @author Ramithaa Pillay
 */
public class TheUseofIFandELSE {
    
    public static void main (String [] args) {
    
     int a;
       
       Scanner input =  new Scanner(System.in);
       
        System.out.print("Enter a number : ");
        a = input.nextInt();
       
       if(a==1){    // must use curly brackett for more than 1 print screen
            System.out.println("One");
            System.out.println("Satu");
        }
        if(a==2){     // if only one print screen than no need curly brackett
            System.out.println("Two");
            System.out.println("Dua");
        }
       if(a==3){
           System.out.println("three");
           System.out.println("Tiga");
       }
       
       else {
        System.out.println("Invalid number"); ///// if any number is inserted the value and the invalid word will appear.
    }
    }
    
}
    


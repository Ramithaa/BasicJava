/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamRevision;

import java.util.Random;

/**
 *
 * @author Ramithaa Pillay
 */
public class TodoRANDOMandgetEVENNUMBERS {
    
    public static void main (String [] args) {
        
        int num;
        int i = 0, control = 0;
        Random rand = new Random ();
       
        System.out.print("Display Random number : " );
        num = rand.nextInt(20);
        System.out.println(num);
        
        System.out.print("Print even numbers : " );
        
        do {
            if (i%2==0){
                System.out.print(i + " , ");// to print even numbers
                control ++ ; // need control, to control the assholes or not line to long
                
        }
           i ++;
        } while (control<num);
    
    }
    
}


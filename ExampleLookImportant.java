/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamRevision;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Ramithaa Pillay
 */
public class ExampleLookImportant {
    
    public static void main (String [] args) {
        
         int num;
         Random rand = new Random ();
        
     do{
            num = rand.nextInt(50);    
        
        }while ((num%2 != 0));  // pay attention to on wether to use the != or == button
        System.out.println(num);   // if you use the !=0 it means even number will keluar
    }                              // if you use the !=1 it means uneven number will print out
                                  
                                   // if you use the ==0 means uneven number will print out
                                   // if you use the ==1 means even number will print out
    
}

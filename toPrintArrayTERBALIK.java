/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamRevision;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ramithaa Pillay
 */
public class toPrintArrayTERBALIK {
    
    public static void main (String [] args) {
        
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        
        
        int num ;
        System.out.println("Enter a number : " );
        num = input.nextInt();
        int [] array = new int [num] ; 
        
         for(int i=0;i<array.length;i++){
           array[i] = rand.nextInt(20)+1;
           System.out.print(" " + array[i]);
        }
        System.out.println(""); // to print the next number in a different time
        
        for(int i=array.length-1;i>=0;i--){   // to print the given array terbalik
           System.out.print(" " + array[i]);
    }
    
    }
    }
    


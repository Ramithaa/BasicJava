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
public class NumberMultiplication2 {
    
    public static void main (String [] args) {
       int value ;
       
        Scanner input = new Scanner (System.in);
        value = input.nextInt(10);
        int [] score = new int [value] ;
        int i;
        
       for(i=0;i<score.length;i++)
            score [i] = i*10 ;
            
       for(i=0;i<score.length;i++)
            System.out.print(" " + score [i]);
    }
}
 
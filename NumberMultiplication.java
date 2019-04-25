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
public class NumberMultiplication {
    
    public static void main (String [] args){
       
        int[] score = new int[10];  // to print how many numbers or also called the score lenght
        int i;
        
        for(i=0;i<score.length;i++)
            score[i] = i*10;
      
        
        for(i=0;i<score.length;i++)
        System.out.print(" " + score[i]);
        
    }
}
   
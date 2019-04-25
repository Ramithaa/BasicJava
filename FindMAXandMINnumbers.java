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
public class FindMAXandMINnumbers {
    
    public static void main (String [] args) {
        
        int a;
        int b;
        int c;
        int d;
        int max;
        int min;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter 4 numbers : " );
  
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        max=a;
        min=a;
        
        
        if(b>max)
           max = b ;
        if(c>max)
           max = c ;
        if(d>max)
           max = d ;
        
        if(b<min)
           min = b ;
        if(c<min)
           min = c ;
        if(d<min)
           min = d ;
        
        System.out.println("The min number is " + min );
        System.out.println("The max number is " + max );
        

        
     
          
        
    
    }
    
}

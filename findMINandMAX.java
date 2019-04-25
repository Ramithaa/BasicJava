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
public class findMINandMAX {
    
    public static void main (String [] args) {
        
         Scanner input = new Scanner(System.in);
        int a,b,c,d,e,min,max;
        
        System.out.print("Enter 5 numbers : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        
        min = a;
        if(b<min)
            min=b;
        if(c<min)
            min=c;
        if(d<min)
            min=d;
        if(e<min)
            min=e;
        
        System.out.println("The minimum is " + min);
        
        
        max = a;
        if (b>max)
            max = b;
        if (c>max)
            max = c;
        if (d>max)
            max = d;
        if (e>max)
            max = e;
        
        System.out.println("The maximum is " + max );
          
    }
    
        
        
    }

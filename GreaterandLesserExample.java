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
public class GreaterandLesserExample {
    
    public static void main (String [] args) { 
    
           int num1,num2;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter two numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1>num2)
            System.out.print(num1 + " greater than "+ num2);
        else 
            System.out.print (num1 + " less than " + num2);
    
}
    
}

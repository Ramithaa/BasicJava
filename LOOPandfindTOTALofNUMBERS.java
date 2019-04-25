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
public class LOOPandfindTOTALofNUMBERS { 
    
     public static void main(String[] args) {   // loop
      
        int number;
        int sum=0;
        Scanner input = new Scanner(System.in);
      
        do{
            System.out.print("Enter a number :");
            number = input.nextInt();
            if(number>=2 && number<=5)  // this only adds number form 2 t0 5, others are ingnored.
                sum += number;  // this one to take all the number that you have entered and sum them up
        }while(number!=-1);  // this is to end the loop when number -1 is inserted
        System.out.println("Total number :" + sum);
    }
    
}

    


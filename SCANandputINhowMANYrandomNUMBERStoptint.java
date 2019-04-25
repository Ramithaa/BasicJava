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
public class SCANandputINhowMANYrandomNUMBERStoptint {
    
    public static void main(String[] args) {
        
           int number,sum=0,rand;
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter how many numbers do you want to generate :");
        number = input.nextInt();
        
        for(int i=0;i<number;i++){
            rand = ran.nextInt(100);
            System.out.println(rand);
            
            if(rand%2==0){  // to plus and give the total for even numbers
                sum += rand;
            }
        }
        System.out.println("Total:" + sum);
    }
    
}

  

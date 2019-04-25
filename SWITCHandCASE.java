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
public class SWITCHandCASE {
    
    public static void main (String [] args) {
        
        int number ;
        Scanner input = new Scanner (System.in);
 
        System.out.println("Enter a number please : " );
        number = input.nextInt();
        
        switch (number) {
            case 1 :                            // case 1 means input one
                System.out.println("one");
                break ;
            case 2 :
               System.out.println("two");     // case two means input two
                break ;
            default :
                System.out.println("Thia system only accepts number one and two");
        }
    }
    
}

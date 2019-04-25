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
public class toSTOPaLOOP {
    
    public static void main (String [] agrs) {
        
        String word ;
        Scanner input = new Scanner (System.in);
        
        do{ 
            System.out.println("Enter a string : " );
            word = input.nextLine();
            
        }while (!(word.equalsIgnoreCase("stop"))); // this is to stop the loop
           // remember, must always have the ! sign
           // or not will run only once
        
        
            
        }
    }
    

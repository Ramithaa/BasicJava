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
public class CompareToIgnoreCaseAndCompareOfString {
    
        public static void main (String [] args) {
    
        String s1, s2;
        
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter First String:");
        s1 = input.nextLine();
        System.out.print("Enter Second String:");
        s2 = input.nextLine();
        
        if (s1==s2) 
            System.out.println("They are equal strings.");
        else
            System.out.println("They are not equal strings.");

        if (s1.equalsIgnoreCase(s2))
            System.out.println("They are equal strings (IgnoreCase).");
        else
            System.out.println("They are not equal strings (IgnoreCase).");
        
        if(s1.compareTo(s2)==0)
            System.out.println("They are equal strings (CompareTo).");
        else 
            System.out.println("They are not equal strings (CompareTo).");
        
        if(s1.compareToIgnoreCase(s2)==0)
            System.out.println("They are equal strings (compareToIgnoreCase).");
        else 
            System.out.println("They are not equal strings (compareToIgnoreCase).");
        
        System.out.println("the value return by compareTo : " + s1.compareTo(s2));
        System.out.println("the value return by compareToIgnoreCase : " + s1.compareToIgnoreCase(s2));
    }
        
}
    


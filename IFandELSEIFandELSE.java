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
public class IFandELSEIFandELSE {
    
   public static void main (String [] args) {
       
       int grade ; 
       char gradeV ; 
       
       Scanner input = new Scanner (System.in);
       grade = input.nextInt();
       
       if(grade>=80 && grade<=100)
           gradeV = 'A' ;
      else if (grade>=60 && grade<80) 
          gradeV = 'B' ;
      else if (grade>=40 && grade<60)
          gradeV = 'C' ;
      else
          System.out.println("You have failed");
       
       
   }
    
}

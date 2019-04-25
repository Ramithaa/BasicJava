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
public class ScannerInpuForInteger {
    
    public static void main (String [] args ){
    
    Scanner input  = new Scanner(System.in);
     int num;
     System.out.print("Enter a number : ");
     num = input.nextInt();
     System.out.println("The number entered is :" + num);
    
}
    
}



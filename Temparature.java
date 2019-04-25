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
public class Temparature {
    
    public static void main (String [] args) {
        
         int a,b,c;
        int temp;
        System.out.print("Enter three number : " );
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        
        if(a>b){             // all thr following are to place the smalllest number first to the biggest number 
            temp = a;        // then it will print the smallest number that can be formed to a temparature
            a = b;
            b = temp;
         }
        if(a>c){
            temp = a;
            a = c;
            c = temp;
         }
        if(b>c){
            temp = b;
            b = c;
            c = temp;
         }
        System.out.println(a + " " + b + " " + c );     // if you dont put the " ". it will print the total of the number
    } 
    
}
        
    
 
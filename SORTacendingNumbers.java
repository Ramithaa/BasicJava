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
public class SORTacendingNumbers {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int num, numflag=0;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        
        int[] Array = new int[num];
        int i=0;
        System.out.print("Original : ");
        do{
           int temp = rand.nextInt(num+10);
           numflag=0;
           for (int j=0; j<=i; j++){
               if (temp==Array[j]){
                   numflag=1;
               }
           }
           if(numflag==0){
               Array[i] = temp;
               System.out.print(" " + Array[i]);
               i++;
           }
        }while(i<Array.length);
        
        // sort start
        	for (int pass = 1; pass < Array.length; pass++ ) 
         	// control number of comparison
		for (i=0;i<Array.length-1;i++ )
                    if ( Array[i] > Array[i+1] ){
               		int hold = Array[i];        
                        Array[i] = Array[i+1];  
			Array[i+1] = hold;
			}
        //sort finish
        
        
        System.out.print("\nSort : ");
        
        for(i=0;i<Array.length;i++){
           System.out.print(" " + Array[i]);
        }
    }
    
}

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
public class SORTtype2BOOLEAN {
    
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int num, numflag=0;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        
        int[] NumArray = new int[num];
        int i=0;
        System.out.print("\nOriginal : ");
        do{
           int temp = rand.nextInt(num+10);
           numflag=0;
           for (int j=0; j<=i; j++){
               if (temp==NumArray[j]){
                   numflag=1;
               }
           }
           if(numflag==0){
               NumArray[i] = temp;
               System.out.print(" " + NumArray[i]);
               i++;
           }
        }while(i<NumArray.length);
        
        boolean flag=true;
        // sort start
        while(flag){
            flag=false;
            for (i=0;i<NumArray.length-1;i++ )            
                if ( NumArray[i] > NumArray[i+1] ){
                    int hold = NumArray[i];        
                    NumArray[i] = NumArray[i+1];  
                    NumArray[i+1] = hold;
                    flag=true;
                }
        }
         	// control number of comparison
            
        //sort finish
        
        
        System.out.print("\nSort : ");
        
        for(i=0;i<NumArray.length;i++){
           System.out.print(" " + NumArray[i]);
        }
         
    }
    
    
}

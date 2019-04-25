/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamRevision;

/**
 *
 * @author Ramithaa Pillay
 */
public class EASYARRAYexample {
    
    public static void main (String [] args) {
        
        int[] number = {11,22,33,44,55,66,77};
        
        //System.out.println(number[0]);
        //System.out.println(number[1]);   // there is two ways to print array 
        //System.out.println(number[2]); 
        //System.out.println(number[3]);
        //System.out.println(number[4]);
        //System.out.println(number[5]);
        //System.out.println(number[6]);     // one of it is this
        
        for(int i=0;i<number.length;i++)
        System.out.print(" " + number [i]);  // the other way is this, to print array
                  // if you put s.o.println then you get a array
                  //if you put s.o.print then you get a normal print like 11,22,33,44 and so on
       
    }
    
}

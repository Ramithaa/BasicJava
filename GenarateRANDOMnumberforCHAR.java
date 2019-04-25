/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamRevision;

import java.util.Random;

/**
 *
 * @author Ramithaa Pillay
 */
public class GenarateRANDOMnumberforCHAR {
    
    public static void main (String [] args) {
       
       char num2 ;
       Random rand = new Random();
   
        System.out.println(num2);
        
        switch(num2){
            case 'A':
                System.out.println("is an A");
                break;
            case 'C':
                System.out.println("is a C");
                break;
            case 'E':
                System.out.println("is a E");
                break;
            case 'B': 
                System.out.println("is a B");
                break;
            case 'D':
                System.out.println("is a D");
                break;
            default:
                System.out.println("Not in the list");
                break;
                
        }
    }
         
    }
    
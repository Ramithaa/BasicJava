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
public class REPARTprintwithAPLUSPLUSandODDnumbers {
 
    public static void main (String [] agrs)  {
    
       int i;
        for(i=1;i<=10;i=i+2)
            System.out.print(i + " ");
        
        System.out.println();
        for(i=1;i<=10;i++)
            if(i%2==1)
                System.out.print(i + " ");
        
        System.out.println();
        for(i=1;i<=10 && i%2==1;i++) // this is how to print number with two conditions
                System.out.print(i + " "); // what does the above line say, ask somebody
        
        System.out.println();
        int k=0;
        do{ 
            if(k%2!=0)
                System.out.print(k + " ");
            k++;
        }while(k<=10);
        
        System.out.println();
        int j=1;
        while(j<=10){
            if(j%2==1)
                System.out.print(j+" ");
            j++;
        }
    }
    
}
    

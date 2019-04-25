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
public class DONTKNOWforwhatBUTjustREAD {
    
     public static void main(String[] args) {
        // TODO code application logic here
        int i, sum=0;
        Random rand = new Random();
        
        for(i=0;i<rand.nextInt(20)+1;i++){ // because of this mine the i doesnt print a range bur prints several number
          sum += i;
            System.out.print(" " + sum );
        }
    }     // input.nextInt(1)+20 means it wil print 20 out put only. the one in the brackeet is not counted
          // input.nextInt(20)+1 means it wil print 1 output minimun. the one in the brackeet is minused one
                                 // means they can print from
}
    


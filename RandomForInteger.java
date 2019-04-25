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
public class RandomForInteger {
    
    public static void main(String[] args) {
        
        Random ran =  new Random();
        
        int num ;  
        num = ran.nextInt(11)+50;  //random number from 50 to 60 - the (11) must always minus 1
        System.out.println(num);   // zero is not included

    
}

}

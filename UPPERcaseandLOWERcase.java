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
public class UPPERcaseandLOWERcase {
    public static void main (String [] args ){
    
    char c='3';
    
        
        if(c>='A' && c<='Z')
            System.out.println(c + " is a capital letter");
        else
            System.out.println(c + " is a small letter");
        
        System.out.println("New Line with other condition");
        
        if(c>='a' && c<='z')
           System.out.println(c + " is a small letter");
        else
           System.out.println(c + " is a capital letter");
        
        System.out.println("New Line with other condition");
          
        if(c>='a' && c<='z')
            System.out.println(c + " is a small letter");
        else if (c>='A' && c<='Z')
           System.out.println(c + " is a capital letter");
        else 
            System.out.println(c+ " is not a character");
        
       
        System.out.println("New Line with Character.isUpperCase");
        
        if(Character.isUpperCase(c))
            System.out.println(c + " is a capital letter");
        else if (Character.isLowerCase(c))
           System.out.println(c + " is a small letter");
        else 
            System.out.println(c+ " is not a character");
        
}


}
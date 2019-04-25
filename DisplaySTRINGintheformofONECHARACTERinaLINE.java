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
public class DisplaySTRINGintheformofONECHARACTERinaLINE {
    
    public static void main (String [] args ){
    
      
        String newChar = "hello world";
        System.out.println(newChar.charAt(0)); // prints the first character of the string in newChar
        
        for(int i=0; i<newChar.length()-2; i++)//the minus 2 means that the end two letter of the string woundlnt appear
        System.out.println(newChar.charAt(i));
    
    
}
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlashN;

/**
 *
 * @author Ramithaa Pillay
 */
public class TheWayToWriteInTheSameLineButDifferentOutput {
    public static void main(String[] args) {
        
        System.out.print("Hello World");
        System.out.print("\nHello World\n");
        System.out.println("Hello World\nHello World"); //println here so that the word "build succesfull comes in the next line"
    }
    
    // output example
            // Hello World
            //Hello World
            //Hello World
            //Hello World
            //BUILD SUCCESSFUL (total time: 8 seconds)
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024041;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Git_2024041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myInput = new Scanner(System.in);
        
        String charName; //variable for the Character name
              
         do { // looping created for when the user don't insert text
            System.out.println("Enter your Character Name below for our Game: ");
            System.out.println("(You must enter text only)!");
            // the output message asking for "text only" together with the 
            // question in looping to be clear
            
            charName = myInput.nextLine(); //read the input name          
            
        }while (!charName.matches("[a-zA-Z!.?', ]+"));
        //user must insert only text
        
        // Question (C)
        charName = charName.toUpperCase(); //modifying the Character's name all to UpperCase
        
        charName = charName + " Gamer"; // adding the word "Gamer" to call the user as a Gamer
        
         System.out.println(" Welcome " + charName + " !! Are you ready to start our Game?");
         //output message with the string character name modificated
    }
    
}

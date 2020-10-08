/**
 * <h1> Puzzle </h1>
 * <p>

 * The class will read word from text file and solve the puzzle which required the words
 * ends with 'dous'.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac Puzzle.java
 * @Run : java Puzzle
 * Programming Assignment 3.
 * @since 06-29-2020
 */
package HW7;

import java.io.*;
import java.util.Scanner;



public class Puzzle {
    //main method is defined here.
    public static void main(String[] args) throws Exception {
        // creating variable of String type : word to store the word from the file.
        String word = "";
        //using absolute path.
        String fileName0 = "/Users/ahco/IdeaProjects/OOP11/words.txt";
        //creating the Scanner object.
        Scanner scanFile = new Scanner(new File(fileName0));
        //while there are numbers in the file.
        while (scanFile.hasNextLine()) {
            //reading the word.
            word = scanFile.nextLine();
            //getting the length of the word.
            int length = word.length();
            //checking for the letters 'dous' at the end of the word in the words.txt
            if (word.length() > 4) {
                if ((word.charAt(length - 4) == 'd')
                        && (word.charAt(length - 3) == 'o')
                        && (word.charAt(length - 2) == 'u')
                        && (word.charAt(length - 1) == 's'))
                {
                    //displaying the word.
                    System.out.println(word);
                }
            }
        }
    }
}

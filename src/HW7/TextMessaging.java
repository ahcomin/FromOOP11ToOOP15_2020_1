/**
 * <h1> TestMessaging </h1>
 * <p>

 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac TestMessaging.java
 * @Run : java TestMessaging
 * Programming Assignment 7.
 * @since 06-29-2020
 */
package HW7;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextMessaging {
    public static void main(String[] args) throws Exception {
        //main method

        //creating the file object for the abbreviations.txt
        File abbreviationFile = new File("abbreviations.txt");
        //Creating the Scanner object for the file.
        Scanner keyboard = new Scanner(abbreviationFile);
        //ArrayList to save the message in the file.
        ArrayList arrMessage = new ArrayList();
        String line;
        //while the file abbreviations.txt has lines.
        while (keyboard.hasNextLine())
        {
            //reading the line.
            line = keyboard.nextLine();
            arrMessage.add(line);

        }
        //taking the name of the original file from the user.
        System.out.println("Enter the name of the original file. : ");
        //creating the scanner object
        Scanner scanner = new Scanner(System.in);
        //storing the name of original file.
        String inputFileName = scanner.next();
        System.out.println("Enter the name of the new file. : ");
        //storing the name of the new file.
        String outputFileName = scanner.next();
        //Creating the Scanner object for the new file.
        Scanner scanInputFile = new Scanner(new File(inputFileName));
        //creating the printWriter object for the outptuFile.
        PrintWriter out = new PrintWriter(new File(outputFileName));
        //getting the line separator for the System.
        String newLine = System.getProperty("line.separator");
        while (scanInputFile.hasNextLine())
        {
            String t;
            line = scanInputFile.nextLine();
            //splitting on the basis of spaces.
            String[] temp = line.split(" ");

            //adding the names to the arrayList.
            for (int i =0; i<temp.length;i++ ){
                //if desired word is there.

                if (arrMessage.contains(temp[i])){
                    t = "<" + temp[i] +">";

                }
                else {
                    //if desired word is not there.
                    t = temp[i];
                }
                //Writing the string i the new file.
                out.write(t +" ");
            }

        }
        out.close();
    }

}
































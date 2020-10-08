/**
 * The program to correcto the ordering of the names of the people
 * in a text file
 *
 * <h1> NamesOfPeople </h1>
 * <p>
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac NamesOfPeople.java
 * @Run : java NamesOfPeople
 * Programming Assignment 2.
 * @since 06-29-2020
 */


package HW7;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NamesOfPeople {
//main method is defined here.
    public static void main(String[] args) throws Exception {
        //creating the File objects.
        File oldFile = new File("oldName.txt");
        File newFIle = new File("newName.txt");

        //getting the line separator for the system.
        String newLine = System.getProperty("line.separator");
        //creating the scanner object : keyboard
        Scanner scanFile = new Scanner(oldFile);
        //creating the PrinterWriter object : out
        PrintWriter out= new PrintWriter(newFIle);
        //Creating ArrayList to save the names in the file.
        ArrayList arrName = new ArrayList();
        String line;

        //while there are names in the old file.
        while (scanFile.hasNextLine()){
            //Reading the line.
            line = scanFile.nextLine();
            //create array ot String type : temp
            //splitting on the basis of spaces.
            String[] temp = line.split(" ");
            //adding the names to the ArrayList
            for (int i = 0; i < temp.length; i++)
            {
                arrName.add(temp[i]);
            }
        }

        //while there are names in the ArrayList
        for (int i = 0; i< arrName.size()-1; i=i+2){
            //writing the name in the new file.
            out.write(arrName.get(i) + " " + arrName.get(i+1));
            //adding the new line.
            out.write(newLine);

        }
        out.close();

    }

}

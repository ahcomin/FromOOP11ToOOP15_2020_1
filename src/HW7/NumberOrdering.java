
/**
 * <h1> NumberOrdering </h1>
 * <p>
 * The program to write the integer and double values from the file.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac NumberOrdering.java
 * @Run : java NumberOrdering
 * Programming Assignment 4.
 * @since 06-29-2020
 */
package HW7;

import java.io.*;

public class NumberOrdering {
    public static void main(String[] args) throws IOException { //main method.
        //original binary file.
        String fileName = "/Users/ahco/IdeaProjects/OOP11/sample.dat";
        //creating variable to output text file
        String outputFileName = "/Users/ahco/IdeaProjects/OOP11/sample.txt";

        //Creating the PrintWriter object for the output file.
        PrintWriter out = new PrintWriter(new File(outputFileName));

        //creating the objectInputStream object
        ObjectInputStream inputStream;
        inputStream = new ObjectInputStream(new FileInputStream(fileName));

        //reading the order of the numbers from the binary file.
        String order = inputStream.readUTF();
        for (int i = 0; i < order.length(); i++) {
            //if the number is an integer
            if (order.charAt(i) == 'i') {
                //reading the number from the binary file.
                int number = inputStream.readInt();
                //writing the number in the text file.
                out.println(number);
            }
            //if the number is a double value.
            else {
                //reading the number from the binary file.
                double number = inputStream.readDouble();
                //writing the number in the text file.
                out.println(number);
            }
        }
        //closing the stream
        out.close();
    }
}

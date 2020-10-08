/**
 * <h1> EmbeddedText </h1>
 * <p>
 * <p>
 * program to verify that a binary file can contain embedded text.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac EmbeddedText.java
 * @Run : java EmbeddedText
 * Programming Assignment 5.
 * @since 06-29-2020
 */
package HW7;

import java.io.*;
//importing the required packages.

public class EmbeddedText {

    public static void main(String[] args) throws IOException {//main method
        //creating the file object
        File inputFileName = new File("sample.records.txt");
        //declaring the objectInputStream object

         ObjectInputStream inputStream =null;
         inputStream = new ObjectInputStream(new FileInputStream(inputFileName));

        try {

                //reading the byte value.
                byte value = inputStream.readByte();

                int intval = value;
                System.out.println("Integer value: " + intval);
                char[] charArray = Character.toChars(value);
                System.out.println("character value :" + charArray[0]);


        }
        //catching the end of the file exception.
        catch (EOFException e) {
           e.printStackTrace();
        }//catching the illegal argument exception.
        catch (IllegalArgumentException ae) {
           ae.printStackTrace();
        }
    }
}

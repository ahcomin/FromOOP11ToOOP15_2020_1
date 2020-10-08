/**
 * <h1> TextFileDemo </h1>
 * <p>

 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac TextFileDemo.java
 * @Run : java TextFileDemo
 * Programming Assignment 1.
 * @since 06-29-2020
 */
package HW7; //pakage of name.

import java.io.*;
import java.util.Scanner; //for using Scanner

public class TextFileDemo {//class name

    //main method is defined here.
    public static void main(String[] args) throws IOException {
        //this file will be created by user with new name.
        File newFile2 = null;

        boolean chk = true;

        //creating the Scanner Object for keyboard entered data.
        Scanner keyboard = new Scanner(System.in);

        //display the message in the first line.
        System.out.println("Enter the original file name : ");

        String nameOfOldFile = keyboard.next();
        //to get name of old file from user.

        System.out.println("Enter the new file name");
        String nameOfNewFile = keyboard.next();
        //to get name of new file from user.

        //creating the file objects. and input each variables at file object.
        File oldFile = new File(nameOfOldFile);
        File newFile = new File(nameOfNewFile);

        //create boolean type variable oldFileExists. cuz of entering 'if' statements
        //And use file method : .exists() for checking whether old file exists
        boolean oldFileExists = oldFile.exists();

        //if the old file does not exist.
        if (!oldFileExists) {
            //display the error message.
            System.out.println(nameOfOldFile + " --> file does not exists!");
            System.exit(0); //to exit system.
        }

        //if the old file can be read.
        //use file method : .canRead()
        //create boolean type variable to be used 'if' statement : Old file can be read
        boolean canReadOldFile = oldFile.canRead();
        //if old file can not be read :
        if (!canReadOldFile) {
            System.out.println(nameOfOldFile + " --> file cannot be read.");
            System.exit(0);//to exit system.
        }

        //creating boolean type variable : new file exists
        //and using file method : .exists(); for checking whether new file exists.
        boolean newFileExists = newFile.exists();
        //whether file override or not.
        boolean isOverridden = false;

        //create while statement to check selection when new file is already exist.
        while (chk) {

            //if the new file exists
            if (newFileExists) {
                //display the message.
                System.out.println(nameOfNewFile + " --> file already exists");

                //display the message
                System.out.println("Press [1] to abort");
                System.out.println("Press [2] to override");
                System.out.println("press [3] to enter a new file.");

                //create scanner object to get the answer from user.
                Scanner scanner = new Scanner(System.in);
                //to get the answer
                int userInput = scanner.nextInt();

                //if user want to abort.
                if (userInput == 1) {
                    System.out.println("This program aborts.");
                    System.exit(0); //to exit system.
                }
                //if user want to override
                if (userInput == 2) {
                    chk = false; //to end the while statement.
                    isOverridden = true;
                }
                //if user want to new file.
                if (userInput == 3) {
                    //display the message
                    System.out.println(" Enter the new file name : ");
                    String newName = scanner.nextLine(); // to get new name from user.
                    chk = false; //to end the while statement.

                }
            } else {
                chk = false; //to end the while statement.
            }
        }
        //If the new file exists and the user does not want to override.
        if (newFileExists && !isOverridden) {
            copyFile(oldFile, newFile2);
        }

        //if user wants to override.
        else if (isOverridden) {
            copyFile(oldFile, newFile);
        }
        //normal case.
        else {
            copyFile(oldFile, newFile);
        }

    }

    //create copyFile method have two parameters : oldFile, newFile
    //and throws Exception to prevent from error.
    public static void copyFile(File oldFile, File newFile) throws IOException {
        //creating String variable
        String line = null;
        //Creating the Scanner Object.
        Scanner in = new Scanner(oldFile);
        //creating the PrintWriter object.
        PrintWriter out1 = new PrintWriter(newFile);

        //while there are numbers in the file.
        while (in.hasNextLine()) {
            line = in.nextLine();
            //to get the number.

            //display line.
            out1.write(line);
        }
        //closing the stream
        out1.close();
    }

}

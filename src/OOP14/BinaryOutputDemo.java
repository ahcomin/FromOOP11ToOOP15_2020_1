package OOP14;

import java.io.*;
import java.util.Scanner;

public class BinaryOutputDemo {
    public static void main(String[] args) {
        String fileName = "number.dat";
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter nonnegative integers.");
            System.out.println("Place a negative number at the end.");
            int anInteger;
            do {
                anInteger = keyboard.nextInt();
                outputStream.writeInt(anInteger);

            } while (anInteger >= 0);
            System.out.println("Number and sentinel value");
            System.out.println("Written to the file " + fileName);
            outputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Problem opening the file " + fileName);
        } catch (IOException e) {
            System.out.println("Problem with output to file" + fileName);
        }

    }

}
//java hexp
package HW7;

/*
 * UTFBinaryFileWriter.java
 *
 * Created on June 5, 2007, 3:05 PM
 *
 * For Exercise 12
 */

/**
 *
 * @author charleshoot
 */

import java.util.*;
import java.io.*;

public class UTFBinaryFileWriter {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the file to create?");
        String fileName = input.nextLine().trim();

        int countInt = 0;
        int countDouble = 0;

        try {
            PrintWriter outFile = new PrintWriter(fileName);
            System.out.println("Enter the values one at a time");
            System.out.println("The values can be integers or doubles, anything else indicates the end");

            // TODO: Write a description of what the following code segment does HERE.
            //
            boolean moreData = true;
            while(moreData){
                if(input.hasNextInt()){
                    int value = input.nextInt();
                    outFile.println("i " + value);
                    countInt++;

                } else if (input.hasNextDouble()) {
                    double value = input.nextDouble();
                    outFile.println("d " + value);
                    countDouble++;
                } else
                    moreData = false;
            }

            outFile.close();

            // TODO: Write a description of what the following code segment does HERE.
            //
            String indicators[] = new String[countInt + countDouble];
            int intValues[] = new int[countInt];
            double doubleValues[] = new double[countDouble];

            Scanner readFile = new Scanner(new File(fileName));

            int count = 0;
            countInt = 0;
            countDouble = 0;
            while(readFile.hasNextLine()){
                Scanner lineScanner = new Scanner(readFile.nextLine());
                String indicator = lineScanner.next();
                indicators[count] = indicator;
                count++;
                if(indicator.equals("i")){
                    intValues[countInt] = lineScanner.nextInt();
                    countInt++;
                }
                if(indicator.equals("d")){
                    doubleValues[countDouble] = lineScanner.nextDouble();
                    countDouble++;
                }
            }
            readFile.close();

            // TODO: Write a description of what the following code segment does HERE.
            //
            String indicatorString = "";
            for(int i=0; i<indicators.length; i++){
                indicatorString = indicatorString + indicators[i];
            }

            // TODO: Write a description of what the following code segment does HERE.
            //

            ObjectOutputStream binaryFile = new ObjectOutputStream(new FileOutputStream(fileName));
            binaryFile.writeUTF(indicatorString);
            countInt = 0;
            countDouble = 0;
            for(int i=0; i<indicators.length; i++){
                if(indicators[i].equals("i")){
                    binaryFile.writeInt(intValues[countInt]);
                    countInt++;
                } else {
                    binaryFile.writeDouble(doubleValues[countDouble]);
                    countDouble++;
                }
            }

            binaryFile.close();

            System.out.println("File created.");
        } catch(Exception e){
            System.out.println("We had a problem:" + e.getMessage());

        }

    }



}


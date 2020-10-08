/**
 * <h1> WriteSpeciesFile </h1>
 * <p>
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Run : java WriteSpeciesFile
 * Programming Assignment 6.
 * @since 06-29-2020
 */
package HW7;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class WriteSpeciesFile extends Species { //extended class by Species
    public static void main(String[] args) throws IOException { //main method
        Species s1 = new Species(); //creating Species object : s1
        //creating file object
        File file = new File("/Users/ahco/IdeaProjects/OOP11/out.txt");
        try {
            FileOutputStream fostream = new FileOutputStream(file);
            ObjectOutputStream oStream = new ObjectOutputStream(fostream);
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter number of species : ");
            int num = keyboard.nextInt();
            for (int z = 1; z <= num; z++) {
                System.out.println(z + ". Specie :");
                System.out.println("---------------------");
                s1.readInput();
            }
            s1.writeOutput(); //check what user input.
            oStream.writeObject(s1);// 파일안에 데이터 넣기
            ObjectInputStream iStream = new ObjectInputStream(new FileInputStream(file));
            Species sp = (Species) iStream.readObject();
            oStream.close();
            iStream.close();


        } catch (FileNotFoundException fn) {
            fn.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
    }

}

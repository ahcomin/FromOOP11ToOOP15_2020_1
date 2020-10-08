package OOP14;

import java.io.*;
import java.util.Scanner;

public class TextFileInputDemo {
    public static void main(String[] args) {
        String fileName = "out.txt";
        Scanner inputStream = null;
        try {
            inputStream = new Scanner(new File(fileName));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
        while (inputStream.hasNextLine()) {
            //더 읽을 게 있는지 없는지 확인해주는 메서드이다.

            String Line = inputStream.nextLine();
            System.out.println(Line);
        }
        inputStream.close();
    }
}

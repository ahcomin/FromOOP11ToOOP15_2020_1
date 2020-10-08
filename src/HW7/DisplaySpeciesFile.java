package HW7;

import java.awt.*;
import java.io.*;

public class DisplaySpeciesFile {

    public static void main(String[] args) throws IOException {//main method

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        inputStream = new BufferedReader(new FileReader("out.txt"));
        outputStream = new PrintWriter(new FileWriter("dest.txt"));

        String line = null;
        while ((line = inputStream.readLine()) != null) {//readLine() 은 BufferReader 클래스에 있는 메소드. 활용하기 유용.
            outputStream.println(line);
        }

        inputStream.close();
        outputStream.close();

    }
}

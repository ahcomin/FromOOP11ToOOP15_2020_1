package OOP14;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        inputStream = new BufferedReader(new FileReader("out.txt"));
        outputStream = new PrintWriter(new FileWriter("dest.txt"));

        String line = null;
        while ((line = inputStream.readLine()) != null) {
            outputStream.println(line);
        }

        inputStream.close();
        outputStream.close();
    }
}

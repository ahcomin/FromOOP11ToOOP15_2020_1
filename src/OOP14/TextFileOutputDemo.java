package OOP14;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

public class TextFileOutputDemo {
    public static void main(String[] args) {
        String fileNae = "out.txt";
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileOutputStream(fileNae,true));
            //appending 이어 붙이기 모드!
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file" + fileNae);
            System.exit(0);
        }

        //텍스트 파일안에 입력하기.
        outputStream.println("This is line 1.");
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++) { //세번 스캐너로 유저로부터 데이터를 받아옴.
            String line = keyboard.nextLine();

            outputStream.println(i + " " + line);


        }
        //파일 열었던 것을 닫아줘야 실행 된다.

        outputStream.close();
        /*
        close를 안하면 어떤 일이 발생 할까?

        어떠한 내용도 적혀 있지 않다.

        어떻게 그래?
파일이 저장되는 방법 :
        > 처음에 데이터가 메모리 버퍼로 간다.
        버터가 정해진 메로리가 차면 그제야 데이모터를 보내기 시작한다.(출발)
        빈자리가 있어도 보내려면 : flush를 사용해야 한다.

        close를 사용하여 닫아주면 메모리 버퍼가 데이터를 보내서 저장해준다.
         */
    }
    /*
   실행하면 아무것도 안나타남.
    근데 이 파일 패스를 찾아보면 out.txt가 생겨있다.
    안에는 아무것도 없다.

     */
}

package OOP14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransactionReader {
    public static void main(String[] args) {
//OOP14에 절대 경로로 들어가서 transaction 파일을 엑셀을 통해서 CSV파일로 전환한다음 저장해야 자바가 인식할 수 있엉. ㅇㅅㅇ;;
        String fileName = "transactions.txt";

        try {
            Scanner inputStream = new Scanner(new File(fileName));

            //read the first line and ignore it
            String line = inputStream.nextLine();

            double total = 0;
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();  //4039,50,0.99,SODA
                String[] ary = line.split(",");
/*


                for (String str : ary){
                    System.out.println(str + " ");
                }
                System.out.println();


 */

                // System.out.ptrint....

                String SKU = ary[0];
                int quantity = Integer.parseInt(ary[1]);
                double price = Double.parseDouble(ary[2]);
                String description = ary[3];


                System.out.printf("sold %d of %s (SKU: $s) at $%1.2f each \n" , quantity,description,SKU,price);

                total += quantity + price;

            }
            System.out.println("Total sales : " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

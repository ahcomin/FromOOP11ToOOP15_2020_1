package OOP13;

import java.util.Scanner;
/*
예외처리하는 법
if 문 안에 있는 코드를 ㅇ
 */
public class GetMilk {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of donuts:");
        int donutCount = keyboard.nextInt();
        try {


        System.out.println("Enter number of glasses of milk:");
        int milkCount = keyboard.nextInt();


            if (milkCount < 1)
            throw new Exception("Exception : No milk!");
/*
            Exception e = new Exception(""); 과 같다!.

 */
            double donutsPerGlass = donutCount / (double) milkCount;
            System.out.println(donutCount + " donuts.");
            System.out.println(milkCount + " glasses of milk.");
            System.out.println("You have " + donutsPerGlass +
                    " donuts for each glass of milk.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Go buy some milk");
        }
        finally {
            System.out.println("End of program.");

        }

    }
}

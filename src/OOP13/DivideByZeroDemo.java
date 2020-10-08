package OOP13;

import java.util.Scanner;

public class DivideByZeroDemo {
    private int numerator;
    private int denominator;
    private double quotient;

    public static void main(String[] args) {//throws DivideByZeroException, Exception 가능!
        DivideByZeroDemo oneTime = new DivideByZeroDemo();

        oneTime.doIt();


    }

    /*
    Declaring exceptions 하는 방법. //책임 전가하기.

        public void doIt() throws DivideByZeroException{ //여기서 오류가나면 책임전가.

                System.out.println("Enter numerator:");
                Scanner keyboard = new Scanner(System.in);
                numerator = keyboard.nextInt();
                System.out.println("Enter denominator:");
                denominator = keyboard.nextInt();
                if (denominator == 0)
                    throw new DivideByZeroException();
                quotient = numerator / (double) denominator;
                System.out.println(numerator + "/" + denominator + " = "
                        + quotient);

            System.out.println("End of program.");
        }

    그러면 oneTi,e.doit();에서 오류가 난다.
    얘에 대해서 try catch 하면 된다
     try {
                oneTime.doIt();

            }catch (DivideByZeroException e){
                System.out.println(e.getMessage());
                givesSecondChance();
            }

     */
    public void doIt() {
        try {
            System.out.println("Enter numerator:");
            Scanner keyboard = new Scanner(System.in);
            numerator = keyboard.nextInt();
            System.out.println("Enter denominator:");
            denominator = keyboard.nextInt();
            if (denominator == 0)
                throw new DivideByZeroException();
            quotient = numerator / (double) denominator;
            System.out.println(numerator + "/" + denominator + " = "
                    + quotient);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
            givesSecondChance();
        }
        System.out.println("End of program.");
    }

    public void givesSecondChance() {

        System.out.println("Try again:");
        System.out.println("Enter numerator:");
        Scanner keyboard2 = new Scanner(System.in);


        numerator = keyboard2.nextInt();
        System.out.println("Enter denominator:");
        System.out.println("Be sure the denominator is not zero.");
        denominator = keyboard2.nextInt();

        if (denominator == 0) {

            System.out.println("I cannot do division by zero.");
            System.out.println("Since I cannot do what you want,");
            System.out.println("the program will now end.");
            System.exit(0);
        }

        quotient = ((double) numerator) / denominator;
        System.out.println(numerator + "/" + denominator +
                " = " + quotient);

    }


}

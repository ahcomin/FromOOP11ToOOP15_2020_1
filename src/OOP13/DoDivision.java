package OOP13;

import java.util.Scanner;

public class DoDivision {
    private int numerator;
    private int denominator;
    private double quotient;

    public static void main(String[] args) {


        DoDivision doIt = new DoDivision();
// TODO: if the denominator is zero,
// give the user second chance by invoking giveSecondChance(); doIt.doNormalCase ();
        System.out.println("End of program.");
    }

    public void doNormalCase() throws DivideByZeroException {
        System.out.println("Enter numerator:");
        Scanner keyboard = new Scanner(System.in);
        numerator = keyboard.nextInt();
        System.out.println("Enter denominator:");
        denominator = keyboard.nextInt();
        if (denominator == 0)
            throw new DivideByZeroException();
        quotient = numerator / (double) denominator;
        System.out.println(numerator + "/" + denominator +
                " = " + quotient);
// giveSecondChance() is given in 9.6
    }
}
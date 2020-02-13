package calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            double a, b, add, sub, mult, divi;
            System.out.println("KALKULATOR v1");

            Scanner liczba = new Scanner(System.in);
            System.out.print("Enter first number a: ");
            a = liczba.nextDouble();

            System.out.print("Enter second number b: ");
            b = liczba.nextDouble();

            add = a + b;
            sub = a - b;
            mult = a * b;

            System.out.println("a + b = " + add);
            System.out.println("a - b = " + sub);
            System.out.println("a * b = " + mult);

            if (a == 0) {
                System.out.println("we do not divide by zero");
            } else {
                divi = a / b;
                System.out.println("a / b = " + divi);
            }
        }catch (Exception z)
        {
            System.out.println("UPS!!!!");
        }

    }
}

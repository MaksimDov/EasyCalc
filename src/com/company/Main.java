package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, s;
        String sign;
        boolean check = true;

        Scanner scannerI = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);

        while (check){
            System.out.println("Введите число -> действие -> число: ");
            a = scannerI.nextInt();
            sign = scannerC.nextLine();
            b = scannerI.nextInt();

            switch (sign){
                case ("+") :
                    s = a + b;
                    System.out.println(a + " " + sign + " " + b + " = " + s);
                    break;
                case ("-") :
                    s = a - b;
                    System.out.println(a + " " + sign + " " + b + " = " + s);
                    break;
                case("*") :
                    s = a * b;
                    System.out.println(a + " " + sign + " " + b + " = " + s);
                    break;
                case ("/") :
                    s = a / b;
                    System.out.println(a + " " + sign + " " + b + " = " + s);
                    break;
            }
            System.out.println("Продолжить(true/false)?");
            check = scannerB.nextBoolean();
        }
    }
}

package taski.task2;

import java.util.Scanner;
/*
Stwórz program, który zapyta użytkownika o dwie liczby całkowite,
a następnie zapyta o operację, którą ma wykonać - dodawanie, odejmowanie, mnożenie, dzielenie.
Wynik operacji wyświetl w konsoli.
*/

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {

            System.out.println(" give me two numbers and choose operation");

            System.out.println("put first number");
            double first = scanner.nextInt();

            System.out.println("put second number");
            double second = scanner.nextInt();

            scanner.nextLine();

            System.out.println("choose operation: +, -, *, /, %");
            String operation = scanner.nextLine().toLowerCase().trim();

            switch (operation) {
                case "add":
                case "+":
                    System.out.println(first + " + " + second + " = " + (first + second));
                    break;
                case "subtract":
                case "-":
                    System.out.println(first + " - " + second + " = " + (first - second));
                    break;
                case "multiply":
                case "*":
                    System.out.println(first + " * " + second + " = " + (first * second));
                    break;
                case "divide":
                case "/":
                    if (second == 0) {
                        System.out.println("wrong operation");
                    } else {
                        System.out.println(first + " / " + second + " = " + (first / second));
                    }
                    break;
                case "modulo":
                case "%":
                    System.out.println(first + " % " + second + " = " + (first % second));
                    break;
                default:
                    System.out.println("wrong operation");

            }

            System.out.println("do you want to continue calculation? (y/n)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("y")) {
                repeat = false;
            }
            scanner.nextLine();

        }

        System.out.println("calculator end");
        scanner.close();


    }
}

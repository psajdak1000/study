package JB.exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class Podatek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger totalIncome = BigInteger.ZERO;

        System.out.println("Podaj ilosc miesięcy " +
                "dochody za kazdy miesiac zostana zsumowane: ");
        int months = scanner.nextInt();

        for (int i = 1; i <= months; i++) {
            System.out.print("Dochód za miesiąc " + i + ": ");
            BigInteger monthlyIncome = scanner.nextBigInteger();
            totalIncome = totalIncome.add(monthlyIncome);
        }
        System.out.println("Łączny dochód za " + months + " miesięcy: " + totalIncome);

        BigInteger tax =
                totalIncome.multiply(BigInteger.valueOf(23))
                        .divide(BigInteger.valueOf(100));
        System.out.println("Podatek (23%): " + tax);

    }

}

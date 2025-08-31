package taski.task2;

import java.util.Scanner;

public class Zaki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj wyraz, sprawdze czy jest palindromem");
        String wyraz = sc.nextLine();
        System.out.println("twoj wyraz: " + wyraz);
        boolean warunek = checkPalindrome(wyraz);
        System.out.println(warunek);

    }

    private static boolean checkPalindrome(String wyraz) {
        String check= wyraz.substring(wyraz.length()/2 ,wyraz.length() -1 );
        StringBuilder check2= new StringBuilder();
        for (int i = 0; i < wyraz.length() / 2; i++) {
            check2.append(check.charAt(i));

        }
        return check.contentEquals(check2);
    }
    }

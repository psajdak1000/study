package taski.task2;

public class Palindrome {
    public static void main(String[] args) {

        String writing = " aab  b aa  "  ;
        int x = 1112;
//        System.out.println(writing);
//        String cleaned = writing.replaceAll("[^a-zA-Z0-9]", "");
//        String palindromereverse = "";
//
//        for (int i = cleaned.length() - 1; i >= 0; i--) {
//            palindromereverse += cleaned.charAt(i);
//        }
//        System.out.println("palindrome reverse: " + palindromereverse);
//        System.out.println("Is it palindrome? " + cleaned.equals(palindromereverse));

        System.out.println(isPalindromenumber(x));
       
    }
    public static boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder reversed = new StringBuilder();
        for (int i = cleaned.length() -1; i>= 0; i--) {
            reversed.append(cleaned.charAt(i));
        }
        return cleaned.contentEquals(reversed);
    }

    public static boolean isPalindromenumber(int x) {

        int original = x;   // zapisz oryginalną wartość

        if(x < 0){
            return false;
        } else {
            int reversed = 0;
            while (x != 0) {
                int digit = x % 10;           // pobierz ostatnią cyfrę
                reversed = reversed * 10 + digit; // dodaj cyfrę z przodu
                x /= 10;                      // usuń ostatnią cyfrę
            }
            return original == reversed;      // porównaj z oryginałem!
        }

    }
}

package taski.task2;

public class Palindrome {
    public static void main(String[] args) {

        String writing = "aabbaa";
        System.out.println(writing);
        String cleaned = writing.replaceAll("[^a-zA-Z0-9]", "");
        String palindromereverse = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            palindromereverse += cleaned.charAt(i);
        }
        System.out.println("palindrome reverse: " + palindromereverse);
        System.out.println("Is it palindrome? " + writing.equals(palindromereverse));
       
    }
}

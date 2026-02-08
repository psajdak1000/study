package JB.exercise;

public class FindStatementsAndExpressions {

    public static void main(String[] args) {
        int a = 5; // statement
        int b = 10; // statement
        int sum = a + b; // statement with an expression (a + b)
        System.out.println("The sum of a and b is: " + sum); // statement with an expression ("The sum of a and b is: " + sum)

        int c;// declaration statement
        c=5;// assignment statement
        int d =10; // statement with an expression (10)
        System.out.println(c+d); // statement with an expression (c + d) method invocation statement

        String name = "Alice"; // statement
        int age; //declaration statement
        age =25;// assignment statement

        System.out.println(name + " is " + age
                + " years old."); // statement with an expression (name + " is " + age + " years old.")

        ;//empty  statement
        // 5+ 10 // expression (5 + 10)
    }
}

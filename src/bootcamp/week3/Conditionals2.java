package bootcamp.week3;

public class Conditionals2 {
    public static void main(String[] args) {
        System.out.println("case: " + someSwitch(1, 2));
        checkNumber(3);
        checkNumber(4);
        checkNumber(14);
        checkNumber(21);

    }

    private static int someSwitch(int a, int b){
        switch(a + b){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Sum is between 1 and 4");
                return 1;
            case 5:
                System.out.println("Sum is 5");
                return 2;
            case 6:
                System.out.println("Sum is 6");
                return 3;
            default:
                System.out.println("Sum is greater than 6");
                return 4;
        }
    }

    private static void checkNumber(int number){
        boolean divisionBy3 = number % 3 == 0;
        boolean divisionBy7 = number % 7 == 0;
        boolean divisionBoth = divisionBy3 && divisionBy7;
        if(divisionBoth){
            System.out.println("Number is divisible by both 3 and 7");
        } else if(divisionBy7){
            System.out.println("Number is divisible by 7");
        } else if(divisionBy3) {
            System.out.println("Number is divisible by 3 ");
        }else {
            System.out.println("Number is not divisible by 3 or 7");
        }
    }
}

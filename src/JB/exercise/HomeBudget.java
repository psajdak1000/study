package JB.exercise;

public class HomeBudget {
    public static void main(String[] args) {
        double monthlyIncome = 5000.0;
        double rent = 1500.0;
        double groceriesCost = 600.0;

        System.out.println();
        System.out.println("Monthly Income: " + monthlyIncome);
        System.out.println("Rent: " + rent);
        System.out.println("Groceries Cost: " + groceriesCost);
        double totalExpenses = rent + groceriesCost;
        System.out.println("Total Expenses: " + totalExpenses);
        double remainingBudget = monthlyIncome - totalExpenses;
        System.out.println("Remaining Budget: " + remainingBudget);

    }
}

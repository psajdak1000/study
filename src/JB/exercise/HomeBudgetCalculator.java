package JB.exercise;

public class HomeBudgetCalculator {
    public static void main(String[] args) {

        int mainSalary = 3000;
        int sideHustle = 2500;
        // Wyświetlenie miesięcznych dochodów
        int totalIncome = mainSalary + sideHustle;
        System.out.println("Monthly Income: " + totalIncome);


        int rent = 1200;
        int groceries = 800;
        int utilities = 300;
        int transportation = 150;
        int entertainment = 200;

        // Wyświetlenie wydatków
        System.out.println("Rent: " + rent);
        System.out.println("Groceries: " + groceries);
        System.out.println("Utilities: " + utilities);
        System.out.println("Transportation: " + transportation);
        System.out.println("Entertainment: " + entertainment);

        // Obliczenie i wyświetlenie sumy wydatków
        int totalCost = rent + groceries + utilities + transportation + entertainment;
        System.out.println("Total Expenses: " + totalCost);

        // Obliczenie i wyświetlenie bilansu
        int monthlyBalance = totalIncome - totalCost;
        System.out.println("Monthly Balance: " + monthlyBalance);

        double savingsGoal = 0.3; // 30% oszczędności
        // Obliczenie i wyświetlenie kwoty na oszczędności (30% bilansu)
        System.out.println("Savings   : "+ (savingsGoal*100)  + "  %  " + (monthlyBalance * savingsGoal));

        // Obliczenie i wyświetlenie pozostałej kwoty po odłożeniu oszczędności
        System.out.println("Remaining After Savings: " + (monthlyBalance * 0.7));

        entertainment = 350;

        totalCost = rent + groceries + utilities + transportation + entertainment;
        monthlyBalance = totalIncome - totalCost;
        // Symulacja: co jeśli wydatki na rozrywkę wzrosną do 350?
        System.out.println("\nSimulation (Entertainment increased to :" + entertainment + "):");
        System.out.println("Total Expenses: " + totalCost);
        System.out.println("Monthly Balance: " + monthlyBalance);
    }
}

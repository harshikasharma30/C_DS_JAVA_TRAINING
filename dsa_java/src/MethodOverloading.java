import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Enter today earning and expenses");
        Scanner sc = new Scanner(System.in);
        int earning = sc.nextInt();
        int expenses = sc.nextInt();

        System.out.println("Get amount in UPI");
        double earningUPI = sc.nextDouble();
        double expensesUPI = sc.nextDouble();

        int saving = (int) todaySavings(earning,expenses);
        double savingUPI = todaySavings(earningUPI,expensesUPI);
        System.out.println("Total Saving  is " + saving);
        System.out.println("Total Saving UPI is " + savingUPI);

    }

    private static double todaySavings(double earningUPI, double expensesUPI) {
        return earningUPI - expensesUPI;
    }

    private static double todaySavings(int earning, int expenses) {
        return(earning-expenses);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to check your eligibility");
        int age = sc.nextInt();
        String adult = (age>=18) ?"Eligible for Voting":"Not Eligible for Voting";
        System.out.println(adult);

    }
}
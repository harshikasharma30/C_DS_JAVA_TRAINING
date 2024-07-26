import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        float weight = (float) sc.nextFloat();
        System.out.println("Enter your height in meter: ");
        float height = (float) sc.nextFloat();
        float bmi = (float)bodyMassIndex(weight,height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You are normal");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight");
        }
        else{
            System.out.println("Obesity");
        }

    }

    private static float bodyMassIndex(float weight, float height) {
        return weight / (height * height);
    }
}
import java.util.Scanner;

public class WeekActivityBySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day of Week: ");
        String day = sc.nextLine();
        switch (day) {
            case "SUNDAY":
                System.out.println("REST");
                break;
            case "Monday":
                System.out.println("GO TO COLLEGE");
                break;
            case "Tuesday":
                System.out.println("PREPARE FOR DSA");
                break;
            case "Wednesday":
                System.out.println("DO JAVA PRACTICE QUESTIONS");
                break;
            case "Thursday":
                System.out.println("REVISION WORK");
                break;
            case "Friday":
                System.out.println("GO TO PARK");
                break;
            case "Saturday":
                System.out.println("DO HOUSEHOLD WORKS");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}

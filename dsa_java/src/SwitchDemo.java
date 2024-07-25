import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Marks : ");
        int marks = sc.nextInt();
        switch (marks) {
            case 10:
                System.out.println("FAIL");
                break;
            case 50:
                System.out.println("PASS D");
                break;
            case 80:
                System.out.println("PASS B");
                break;
            case 100:
                System.out.println("PASS A");
                break;
            default:
                System.out.println("Enter right choice");
        }
    }
}

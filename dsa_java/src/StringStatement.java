import java.util.Scanner;

public class StringStatement {
    public static void main(String[] args) {
        String name = "harshika sharma";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("Harshika Sharma")) {
            System.out.println("allowed");
        }else {
            System.out.println("denied");
        }
    }
}

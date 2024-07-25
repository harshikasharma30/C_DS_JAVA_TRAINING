import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        printMyName();//method calling
    }
// create method
    private static void printMyName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String myname = sc.nextLine();
        System.out.println(myname);
    }
}

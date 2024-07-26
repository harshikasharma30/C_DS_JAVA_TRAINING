import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        int rectangleArea = area(length,width);
        System.out.println("The area of the rectangle is " +rectangleArea);
    }

    private static int area(int length, int width) {
        return length*width;
    }
}

public class ForLoopDemo {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("ACCENDING ORDER");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("\nDECENDING ORDER ");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum is = " +sum);
    }
}

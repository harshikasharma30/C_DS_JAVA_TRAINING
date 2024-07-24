public class WhileLoopDemo {
    public static void main(String[] args) {
        int sum=0 , i=1;
        System.out.println("ACCENDING ORDER");
        while(i<=10) {
            System.out.println(i);
            i++;
        }
        System.out.println("DECENDING ORDER");
        while(i>=2) {
            i--;
            System.out.println(i);
            sum+=i;
        }
        System.out.println("SUM OF THE NUMBER IS "+sum);
    }
}

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int sum=0 , i=1;
        System.out.println("ACCENDING ORDER");
        do {
            System.out.println(i);
            i++;
        }while(i<=10);
        System.out.println("DECENDING ORDER");
        do {
            i--;
            System.out.println(i);
            sum+=i;
        }while(i>=2);
        System.out.println("Sum is = " +sum);
        String check = (sum/2==0)?"Even":"Odd";
        System.out.println(check);
    }
}

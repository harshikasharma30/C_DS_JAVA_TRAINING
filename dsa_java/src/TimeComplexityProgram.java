public class TimeComplexityProgram {
    public static void main(String[] args) {
        int i, n = 8;
        for (i = 2; i <= n; i=(int)Math.pow(i,2)) {
            System.out.println("Hello World !!!");
        }
        // n=8 iter=2
        //n=12 iter=2
        //n=16 iter=3
        //n=32 iter=3
    }
}

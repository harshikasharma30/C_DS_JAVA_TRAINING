import java.util.Scanner;
public class currencyConverter
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice>: \n1. INR to USD \n2. USD to INR \n3. INR to Euro \n4. Euro to INR");
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
            {
                System.out.println("Enter the amount in INR:");
                int s=sc.nextInt();
                System.out.println("Amount in USD =$ "+ s*0.012);
                break;
            }
            case 2:
            {
                System.out.println("Enter the amount in USD:");
                int s=sc.nextInt();
                System.out.println("Amount in INR= Rs. "+ s*83.73);
                break;
            }
            case 3:
            {
                System.out.println("Enter the amount in INR:");
                int s=sc.nextInt();
                System.out.println("Amount in Euro =EUR "+ s*0.011);
                break;
            }
            case 4:
            {
                System.out.println("Enter the amount in Euro:");
                int s=sc.nextInt();
                System.out.println("Amount in INR =Rs."+ s*90.88);
                break;
            }
            default:{
                System.out.println("Invalid Input!!!! \n Please Choose 1 ,2,3 or 4");
            }

        }
    }
}
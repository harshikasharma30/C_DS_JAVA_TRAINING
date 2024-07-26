import java.util.Random;
public class OtpGeneration {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Generate OTP(One Time Password)");
        int myOTP = random.nextInt(1000000);
        System.out.println(" Your OTP is : " + myOTP);

    }
}

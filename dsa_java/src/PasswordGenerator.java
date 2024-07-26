import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        System.out.println("Generated Password: " + generatePassword(8));
    }

    public static String generatePassword(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        password.append((char) (random.nextInt(26) + 'A'));
        password.append((char) (random.nextInt(26) + 'a'));
        password.append((char) (random.nextInt(10) + '0'));
        String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 3; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }
        char[] passwordArray = password.toString().toCharArray();
        return new String(passwordArray);
    }
}

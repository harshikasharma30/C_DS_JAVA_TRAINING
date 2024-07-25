public class ArrayDemo {
    public static void main(String[] args) {
        String[] friendNames = {"Shruti","shreya","shail","shalini","Harshika","ABC"};
        System.out.println(friendNames[1]);
        System.out.println(friendNames.length);
        friendNames[5]="Yashvika";
        System.out.println(friendNames[5]);
        for (int i = 0; i < friendNames.length; i++) {
            System.out.println(friendNames[i]);
        }
    }
}

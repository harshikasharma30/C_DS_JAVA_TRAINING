public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 11, 24, 9};
        int temp = 0 , sum = 0 , av=0;
        System.out.println("Sorting Array in Ascending Order: ");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println("Sorting Array in Descending Order: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];
        }
        av = sum/arr.length;

        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + av);
    }
}

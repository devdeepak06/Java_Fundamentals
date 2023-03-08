import java.util.Scanner;

public class FindLargestElement {
    public static int[] takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = s.nextInt();
            System.out.println("Enter the elements of the array: ");
            int input[] = new int[size];
            for (int i = 0; i < size; i++) {
                input[i] = s.nextInt();
            }
            return input;
        }
    }

    public static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(arr);
        System.out.println("The largest number in the array is: " + findLargest(arr));
    }
}

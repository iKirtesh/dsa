package Arrays.Phase_1;

import java.util.Scanner;

public class OccurrenceOfNumberArray {

    public static void countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        if(count == 0) System.out.println("Element not found");
        System.out.println("The " + key + " is " + count + " times");
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 6, 5, 6, 7, 8, 9};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = in.nextInt();
        countOccurrences(arr, n);
    }
}

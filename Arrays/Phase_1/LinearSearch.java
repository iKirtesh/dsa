package Arrays.Phase_1;

import java.util.Scanner;

public class LinearSearch {

    // Shorter version
    public static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found ar Index: " + i);
                break;
            }
        }

        System.out.println("Element not found");
    }

    public static void linearSearchUsingFlag(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found ar Index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, -4, -7, 0 };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be searched: ");
        int n = input.nextInt();

//        linearSearch(arr, n);
        linearSearchUsingFlag(arr, n);
    }
}

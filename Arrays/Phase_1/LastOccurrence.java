package Arrays.Phase_1;

import java.util.Scanner;

public class LastOccurrence {

    private static void lastOccurrence(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
            }
        }

        if(index != -1){
            System.out.println("The last occurrence of " + key + " is " + index);
        } else {
            System.out.println("No such element in the array");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 10, 30};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int  n = in.nextInt();
        lastOccurrence(arr, n);
    }
}

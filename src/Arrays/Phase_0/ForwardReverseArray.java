package Arrays.Phase_0;

public class ForwardReverseArray {

    public static void forwardArray(int[] arr) {
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        System.out.print("\nReverse Array : ");
        for (int i = arr.length - 1;  i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        forwardArray(arr);
        reverseArray(arr);
    }
}
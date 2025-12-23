package Arrays.Phase_0;

public class SumAverageArray {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int averageArray(int[] arr) {
        int avg = sumArray(arr);
        return avg / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Sum of Array: " + sumArray(arr));
        System.out.println("Sum of Array: " + averageArray(arr));
    }
}

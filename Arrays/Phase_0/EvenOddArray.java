package Arrays.Phase_0;

public class EvenOddArray {

    public static String evenOddArray(int[] arr) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return "Even number: " + countEven + "\nOdd number : " + countOdd;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(evenOddArray(arr));
    }
}
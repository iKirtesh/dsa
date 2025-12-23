package Arrays.Phase_1;

public class CheckSorted {

    private static void checkSort(int[] arr) {
        boolean isSorted = true;
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        checkSort(arr);
    }
}

package Arrays.Phase_1;

public class ReplaceNegative {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -15};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.print("Arrays after Negative  Replacement: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

package Arrays.Phase_1;

public class CountGreater {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int k = 25;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}


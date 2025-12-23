package Arrays.Phase_0;

public class CountPositiveNegativeZeroArray {

    public static String count(int[] arr){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        return "Positive: " + positive + "\nNegative: " + negative + "\nZero    : " + zero;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, -4, -7, 0 };
        System.out.println(count(arr));
    }
}

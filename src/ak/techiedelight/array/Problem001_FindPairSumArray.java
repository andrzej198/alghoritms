package ak.techiedelight.array;



/**
 * https://www.techiedelight.com/find-pair-with-given-sum-array/
 */
public class Problem001_FindPairSumArray {


    public static void main(String[] args) {
        int [] input_arr = new int[] {8, 7, 2, 5, 3, 1};
        int input_sum = 10;

        solution1(input_arr, input_sum);
    }


    private static void solution1(int[] array, int sum){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int tempSum = array[i] + array [j];
                if ( i != j && tempSum == sum) {
                    String message = String.format("Pair found at index %d and %d (%d + %d)", i, j, array[i], array[j]);
                    System.out.println(message);
                }
         }
        }

    }

}

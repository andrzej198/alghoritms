package ak.techiedelight.array;

import ak.data.UtilsPrint;

import java.util.Random;


/**
 * https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
 */
public class Problem002_SubarrayWith0Sum {
    public static void main(String[] args) {
        int [] input_arr = new int[] { 3, 4, -7, 3, 1,  3, 1,  -4, -2, -2 };
        int input_sum = 10;

        checkIfSubarrayWith0SumExist(input_arr);
    }


    private static void checkIfSubarrayWith0SumExist(int[] array){
        int [][] sumMatrix = new int[array.length][array.length];
        System.out.println("Input array");
        UtilsPrint.printArray(array);

//        System.out.println("Matrix before update");
//        UtilsPrint.printMatrix(sumMatrix);


        System.out.println("Sum 0 subarrays:");
        //update matrix:
        for (int start = 0; start < array.length; start++) {
            for (int end = 0; end < array.length ; end++) {
//                matrix[x][y] =
                if (start > end){
                    sumMatrix[start][end] = -100;
                }else if(start == end){
                    sumMatrix[start][end] = array[start];
                }else {
                    sumMatrix[start][end] =  sumMatrix[start][end-1] + array[end];
                }

                if(sumMatrix[start][end] == 0 ){
//                    System.out.println("I have 0 sum start: " + start + " end: " + end);
//                    UtilsPrint.printMatrix(sumMatrix);
//                    System.out.println("Array: ");

                    UtilsPrint.printArrayFromTo(array, start, end);
                }
           }
        }

        System.out.println("Matrix after update");
        UtilsPrint.printMatrix(sumMatrix);



    }

}

package ak.data;


import java.util.Arrays;

public class UtilsPrint {

    public static void printArray(int[] intArray) {
        printArrayFromTo(intArray, 0, intArray.length - 1);
    }

    public static void printArrayFromTo(int[] intArray, int from, int to) {
        String[] strArray = new String[1 + to - from];

        for (int i = 0; i < strArray.length; i++)
            strArray[i] = String.valueOf(intArray[i + from]);

        System.out.println(Arrays.toString(strArray));

    }

    public static void printMatrix(int[][] matrix) {
        String[] strArray = new String[matrix.length];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix.length; x++) {
                strArray[x] = String.valueOf(matrix[x][y]);
            }
            System.out.println(Arrays.toString(strArray));
        }
    }


    public static void printMatrix(int[][] matrix, int digits) {
        String[] strArray = new String[matrix.length];
        String formater = "%0" + digits + "d";

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix.length; x++) {
                strArray[x] = String.format(formater, matrix[x][y]);
            }
            System.out.println(Arrays.toString(strArray));
        }
    }
}



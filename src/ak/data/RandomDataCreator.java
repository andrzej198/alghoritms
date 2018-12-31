package ak.data;

import java.util.Random;

public class RandomDataCreator {

    public static int[] randomArray(int size, int maxValue) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(maxValue);
        }
        return array;
    }

    public static int[][] randomMatrix(int size, int maxValue) {
        int[][] matrix = new int[size][size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                matrix[x][y] = new Random().nextInt(maxValue);
            }
        }
        return matrix;
    }


    public static void main(String[] args) {
        System.out.println("Print random Array: ");
        UtilsPrint.printArray(randomArray(5, 10));

        System.out.println("Print random matrix: ");
        UtilsPrint.printMatrix(randomMatrix(5, 10));

        System.out.println("Print random matrix with two digits formater: ");
        UtilsPrint.printMatrix(randomMatrix(5, 100), 2);
    }
}

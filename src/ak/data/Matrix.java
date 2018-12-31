package ak.data;

import java.util.Random;

public class Matrix {
    private int [][] matrix ;


    public Matrix(int size){
        matrix = new int[size][size];
    }

    public void fillWithRandomData(int maxValue){
     int size = matrix.length;

     for (int x = 0; x < size; x++) {
         for (int y = 0; y < size; y++) {
             matrix[x][y] = new Random().nextInt(maxValue);
         }
     }
     }

    @Override
    public String toString() {

        return super.toString();
    }
}

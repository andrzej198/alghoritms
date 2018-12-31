package ak.techiedelight.matrix;

import ak.data.RandomDataCreator;
import ak.data.UtilsPrint;

/**
 * https://www.techiedelight.com/find-all-paths-from-source-to-destination-in-matrix/
 */
public class Problem001_FIndAllPathsFromFirstCellToLastCell {

    static void doStep(int [][] matrix, int x, int y, String path){
        String r = path;
        //print value from matrix
//        System.out.println("I am in step (x,y) ("+x +", "+ y +")" );
            if(x == 0 && y == 0){

            }else{
                r+=" - ";
            }
            r+= matrix[x][y];

            if(x < matrix.length-1){
                doStep(matrix, x+1, y, r);
            }

            if (y < matrix.length-1){
                doStep(matrix, x, y+1, r);
            }

            if(x == matrix.length-1 && y == matrix.length -1){
                //r+="\n";
                System.out.println(r);
            }
    }


    public static void main(String[] args) {
        int [][] matrix = RandomDataCreator.randomMatrix(3, 9);
        UtilsPrint.printMatrix(matrix);
        doStep(matrix, 0, 0, "");

//        System.out.println(ret);
    }
}

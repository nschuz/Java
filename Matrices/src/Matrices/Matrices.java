package Matrices;

public class Matrices {
    public static void main(String[] args) {

        /*

        0,0  1,0  2,0  3,0
        0,1  1,1  2,1  3,1
        0,2  1,2  2,2  3,2

        * */

        int [ ][ ] matrix = new int [3][3];
        // matrix[0][0]=10;

        for (int i = 0; i <3; i++) {
//0,1,2
            for (int j = 0; j <3 ; j++) {
                System.out.println(matrix[i][j]+ " - ");
            }
            System.out.println("\n");

        }

        int [][] matriz= {
            {
                10,12,11,13
            },
            {
                20,12,13,12
            }
        };

    }
}

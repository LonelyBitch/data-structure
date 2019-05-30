package FourDay;

/**
 * 环形打印矩阵
 * 利用宏观的思维去想问题，总结规律
 */
public class PrintMatrix {

    public static void printMatrixOrder(int[][] matrix) {

        int aR = 0;
        int aC = 0;
        int bR = matrix.length - 1;
        int bC = matrix[0].length - 1;

        while (aR <=  bR && aC <= bC) {


        }

    }

    public void printEde(int[][] matrix, int aR, int aC, int bR, int bC){

        if (aR==bR){
            for (int i =aC; aC<=bC; aC++){
                System.out.println(matrix[aR][i]+"*");
            }
        }else if(aC == bC){
            for (int i = aR; aR<=bR; aR++){
                System.out.println(matrix[i][aC]);
            }
        }else {
            int curC = aC;
            int curR = aR;
            while (curC != bC) {
                System.out.print(matrix[bR][curC] + " ");
                curC++;
            }
            while (curR != bR) {
                System.out.print(matrix[curR][bC] + " ");
                curR++;
            }
            while (curC != aC) {
                System.out.print(matrix[bR][curC] + " ");
                curC--;
            }
            while (curR != bR) {
                System.out.print(matrix[curR][aC] + " ");
                curR--;
            }
        }
    }

}

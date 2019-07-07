/**
 * 顺时针打印矩阵
 * 选择对角线的两个点， 每次以两个点来圈定要打印的矩阵
 */
public class 顺时针打印矩阵 {

    public void printMatrix(int[][] matrix) {
        int ac = 0;
        int ar = 0;
        int bc = matrix[0].length - 1;
        int br = matrix.length - 1;

        while (ac <= bc && ar <= br) {

            if (ac <= bc) {
                for (int i = ac; i <= bc; i++) {
                    System.out.println(matrix[ar][i]);
                }

            }
            if (ar <= br) {
                for (int i = ar+1; i <= br; i++) {
                    System.out.println(matrix[i][bc]);
                }

            }
            if (ac <= bc && ar <= br) {
                for (int i = bc-1; i >= ac; i--) {
                    System.out.println(matrix[br][i]);
                }
            }

            if (ac <= bc && ar <= br){
                for (int i = br-1; i >= ar; i--) {
                    System.out.println(matrix[i][ac]);
                }
            }

            ac++ ; ar++;
        }
    }
}

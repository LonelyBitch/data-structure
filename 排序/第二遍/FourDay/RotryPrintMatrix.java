package FourDay;

/**
 * 旋转打印
 * <p>
 * 每次打印 范围缩小一圈
 * 通过计算 算出该点下一个位置的点 依次类推 最后交换四个点
 */
public class RotryPrintMatrix {

    public static void printRotry(int[][] matrix) {

        int tr = 0;
        int tc = 0;
        int dr = matrix.length - 1;
        int dc = matrix[0].length - 1;

        while (tr < dr) {
            MatrixSwap(matrix, tr++, tc++, dr--, dc--);
        }
    }

    public static void MatrixSwap(int[][] matrix, int tr, int tc, int dr, int dc) {
        int L = dc - tc;//能够旋转的一定是正方形
        int i = 0;
        int temp = 0;

        while (i < L) {

            temp = matrix[tr][tc + i];
            matrix[tr][tc + i] = matrix[dr - i][tc];
            matrix[dr - i][tr] = matrix[dr][dc - i];
            matrix[dr][dc - i] = matrix[tr + i][dc];
            matrix[tr + i][dc] = temp;

            i++;
        }

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i != matrix.length; i++) {
            for (int j = 0; j != matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9 }};

        printMatrix(matrix);
        System.out.println("*************************");
        printRotry(matrix);

        printMatrix(matrix);

    }

}

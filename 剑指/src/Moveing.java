public class Moveing {

    /**
     * 矩阵问题， 矩阵感染。岛问题
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(numSum(12));

    }

    public static int moveingCount(int[][] arr, int a, int b, int thresHold) {

        if (arr == null) return 0;
        int colum = arr.length;
        int rows = arr[0].length;

        return helper(arr, a, b, colum, rows, thresHold);
    }

    public static int helper(int[][] arr, int a, int b, int colum, int row, int thresHold) {

        if (a < 0 || a > row || b < 0 || b > colum || numSum(a) + numSum(b) == thresHold || arr[a][b] == 1) {
            return 0;
        }

        return helper(arr, a + 1, b, colum, row, thresHold)
                + helper(arr, a - 1, b, colum, row, thresHold)
                + helper(arr, a, b + 1, colum, row, thresHold)
                + helper(arr, a, b - 1, colum, row, thresHold)
                + 1;
    }

    public static int numSum(int i) {

        if (i < 10) return i;
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            System.out.println(i / 10);
            i = i / 10;
        }

        return sum;

    }

}

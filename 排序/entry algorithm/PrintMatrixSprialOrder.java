public class PrintMatrixSprialOrder {

    public static void SprialPrintOrder(int[][] matrix) {

        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;

        while (tR <= dR && tC <= dC) {
            printEdg(matrix,tR++,tC++,dC--,dR--);
        }


    }

    public static void printEdg(int[][] matrix, int tr, int tc, int dc, int dr) {

        if (tr ==dr){
            while (tc<=dc){
                System.out.println(matrix[tr][tc++]);
            }
        }else if (tc == dc){
            while (tr<=dr){
                System.out.println(matrix[tc][tr++]);
            }
        }else{
            int curC = tc;
            int curR = tr;
            while (curC != dc) {
                System.out.print(matrix[tr][curC] + " ");
                curC++;
            }
            while (curR != dr) {
                System.out.print(matrix[curR][dc] + " ");
                curR++;
            }
            while (curC != tc) {
                System.out.print(matrix[dr][curC] + " ");
                curC--;
            }
            while (curR != tr) {
                System.out.print(matrix[curR][tc] + " ");
                curR--;
            }
        }

    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        SprialPrintOrder(matrix);

    }
}

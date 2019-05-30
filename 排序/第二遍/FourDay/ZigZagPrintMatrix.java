package FourDay;

/**
 * 之字型打印矩形
 */
public class ZigZagPrintMatrix {

    public static void prientZigZag(int[][] martix) {

        int tR = 0;
        int tC = 0;
        int dR = 0;
        int dC = 0;
        int endR = martix.length - 1;
        int endC = martix[0].length - 1;

        boolean b = false;
        while (tR <= endR) {

            prientAll(b, martix, tR, tC, dR, dC);

            tC = tC == endC ? endC : tC++;
            tR = tR == endR ? endR : tR++;
            dR = dR == endR ? endR : dR++;
            dC = dC == endC ? endC : dC++;

            b = !b;

        }

    }

    public static void prientAll(boolean b, int[][] martix, int tR, int tC, int dR, int dC) {
        if (b) {
            while (tR < dR + 1) {
                System.out.println(martix[tC--][tR++]);
            }
        } else {
            while (dR > tR - 1) {
                System.out.println(martix[dC++][dR--]);
            }
        }
    }
}

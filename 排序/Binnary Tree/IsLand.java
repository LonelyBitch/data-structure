import java.util.jar.JarEntry;

public class IsLand {
    public static int findLandNum(int[][] arr) {

        if (arr == null) {
            return 0;
        }
        int num = 0;
        int Rows = arr[0].length;
        int Columns = arr.length;

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; i++) {
                if (arr[i][j] == 1) {
                    num++;
                }
            }
        }
        return num;
    }

    public static void infection(int[][] arr, int i, int j) {

        if (arr == null ) {
            return;
        }
        arr[i][j] = 1;
        infection(arr, ++i,j);
        infection(arr, --i,j);
        infection(arr,i,--j);
        infection(arr,i,--j);

    }
}

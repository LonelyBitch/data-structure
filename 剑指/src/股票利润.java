
public class 股票利润 {

    public int findMaxDiff(int[] arr) {

        if (arr.length == 0 || arr == null) return -1;

        int min = arr[0];
        int max = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {

            if (arr[i - 1] < min) {
                min = arr[i];
            }

            if (max < arr[i] - min) {
                max = arr[i] - min;

            }

        }

        return max;
    }
}

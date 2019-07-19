/**
 * 礼物的最大值 请运用动态规划来解题 虽然我现在还不知道什么是动态规划
 * 可以用二位数组去保存该点左边 和上边的值 ，用于取出来最大值 来算出该点的最大值
 * 但是前面的点都是没有用的也就是 可以用一个一位数组来记录左边和上后边的所有用的值
 */
public class 礼物的最大值 {

    public static int GetMaxValue(int[][] arr) {

        int c = arr[0].length;
        int r = arr.length;

        int[] maxValue = new int[c];

        //用两层for循环去遍历
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int up = 0;
                int left = 0;

                if (i > 0) up = maxValue[j];
                if (j > 0) left = maxValue[j - 1];

                maxValue[j] = Math.max(up, left) + arr[i][j];
            }
        }

        return maxValue[c - 1];
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 10, 3, 8}, {12, 2, 9, 6}, {5, 7, 4, 11},
                {3, 7, 16, 5}};
        System.out.println(GetMaxValue(arr));
    }

}

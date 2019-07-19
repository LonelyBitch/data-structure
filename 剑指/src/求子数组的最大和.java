/**
 * 求子数组的最大和
 * 出现比原来打的和就记录一次 ，
 */
public class 求子数组的最大和 {

    public int FindGreatSumofSubArray(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return 0;
        }

        int sum = 0;
        int greast = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum > 0 ? arr[i] : sum + arr[i];

            greast = sum > greast ? sum : greast;
        }

        return greast;
    }
}

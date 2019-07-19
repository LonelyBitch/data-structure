import java.util.Arrays;

public class 扑克牌中的顺子 {
    public boolean isContinous(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        int count = 0;
        int temp = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != arr[i + 1]) {
                temp = arr[i + 1] - arr[i] - 1;
            } else {
                return false;
            }
        }

        if (count > temp) return true;

        return false;

    }

}

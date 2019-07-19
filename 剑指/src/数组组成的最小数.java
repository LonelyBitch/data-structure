import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 利用比较器比较数字的前后顺序
 */
public class 数组组成的最小数 {

    public static void main(String[] args) {

    }

    public String findMinNumber(int[] nums) {

        if (nums == null || nums.length == 0)
            return "";
        String[] strs = new String[nums.length];

        for (int i = 0; i < strs.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o1).compareTo(o2 + o1);
            }
        });

        StringBuffer sb = new  StringBuffer();

        for (int i = 0; i < strs.length; i++) {

            sb.append(strs[i]);
        }

        return sb.toString();
    }

}

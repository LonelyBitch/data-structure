import com.sun.corba.se.impl.orbutil.LogKeywords;

/**
 * 用两个指针去控制整个区域的范围
 */
public class 和为S的数 {


    public int[] findNum(int[] arr, int target) {

        int[] result = new int[2];
        int right = arr.length - 1;
        int left = 0;
        while (right < left) {
            if (arr[right] + arr[left] == target) {
                result[0] = arr[right];
                result[1] = arr[left];

                return result;
            }

            if (arr[right] + arr[left] > target){

                right--;
            }

            if (arr[right] + arr[left] < target){
                left++;
            }

        }

        return null;
    }
}

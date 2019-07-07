/**
 * 递归的去解析， 每次选取数组的最后一位是二叉树的根节点，左边一定小于它右边一定大于它 然后递归这个过程
 */
public class 判断数组是否是一颗搜索二叉树 {

    public boolean ifBST(int[] arr) {

        if (arr.length == 0 || arr == null) {
            return false;
        }


        return process(arr, 0 , arr.length-1);

    }

    public boolean process(int[] arr, int start, int end) {

        if (start-end<=1) return true;

        while (arr[end] > arr[start] && start < end) {
            start++;

        }
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[end]) {
                return false;
            }
        }
        return process(arr, 0, start-1) && process(arr, start, end-1);
    }
}

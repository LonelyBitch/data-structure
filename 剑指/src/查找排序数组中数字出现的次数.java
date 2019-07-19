/**
 * 后期改非递归
 */
public class 查找排序数组中数字出现的次数 {

    public int getFirst(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int result = -1;
        int mind = (left + right) >> 1;
        if (arr[mind] == target) {
            if (mind == 0 || arr[mind - 1] != target) {
                return mind;
            } else {
                mind -= 1;
            }
        } else if (arr[mind] > target) {
            right = mind - 1;
        } else {
            left = mind + 1;
        }

        return getFirst(arr, right,left,target);
    }

    public int getLast(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int result = -1;
        int mind = (left + right) >> 1;
        if (arr[mind] == target) {
            if (mind == arr.length-1 || arr[mind + 1] != target) {
                return mind;
            } else {
                mind += 1;
            }
        } else if (arr[mind] > target) {
            right = mind - 1;
        } else {
            left = mind + 1;
        }

        return getLast(arr, right,left,target);
    }

    public int getCount(int[] arr,int target){
        int first = getFirst(arr, 0, arr.length - 1, target);
        int last = getLast(arr, 0, arr.length - 1, target);

        return (last-first)+1;
    }

}

/**
 * 查找旋转数组总的最小数
 */

public class FindMin {

    public static void main(String[] args) {


    }

    public static int findTarget(int[] arr, int index1, int index2) {

        int indexMid = index1;
        if (arr[index1] < arr[index2]) {
            return indexMid;
        }

        if (index1 - index2 == 1) {
            indexMid = index2;
        }
        while (arr[index1] > arr[index2]) {
            indexMid = (index1 + index2) / 2;
            //当出现三个边界数字相等的时候
            if (arr[index1] == arr[indexMid] && arr[indexMid] == arr[index2]) {
                return GetMinOrder(arr, index1, index2);
            }

            //当中点落在前半部分
            if (arr[index1]< arr[indexMid]){
                index1 = indexMid;
            }

            //当中点落在后半部分的时候
            if(arr[index2]>arr[indexMid]){
                index2 = indexMid;
            }

            return arr[indexMid];
        }


        return indexMid;
    }

    public static int GetMinOrder(int[] arr, int index1, int index2) {
        int result = index1;

        int p = index1 + 1;
        while (p <= index2) {
            if (arr[index1] > arr[p]) {
                result = p;
            }
        }

        return arr[result];

    }
}

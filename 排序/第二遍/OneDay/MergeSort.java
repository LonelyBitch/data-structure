package OneDay;

/**
 * 排序算法 注重比较的过程
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 4, 7, 5, 6};
        MergeSort(arr);
        print(arr);

    }

    public static void MergeSort(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return;
        }

        MergeSort(arr, 0, arr.length - 1);

    }

    public static void MergeSort(int[] arr, int l, int r) {

        if (l >= r) {
            return;
        }

        int mind = l + ((r - l) >> 1);
        MergeSort(arr, l, mind);
        MergeSort(arr, mind + 1, r);
        Merge(arr, l , r,mind);

    }

    public static void Merge(int[] arr, int l, int r, int mind) {
        int i = 0;
        int[] help = new int[r - l + 1];
        int p1 = l;
        int p2 = mind + 1;
        while (p1 < mind + 1 && p2 <= r) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1<mind+1){
            help[i++] = arr[p1++];
        }

        while (p2<=r){

            help[i++] = arr[p2++];
        }

        for (i= 0 ; i<help.length;i++){
            arr[l++] = help[i];
        }


    }
    public static void print(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


}

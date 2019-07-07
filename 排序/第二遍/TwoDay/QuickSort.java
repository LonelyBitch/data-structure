package TwoDay;

/**
 * 随机快排的实现
 */
public class QuickSort {


    public static void main(String[] args) {

        int[] ints = {5, 2, 4, 3, 5, 2, 1};
        QuickSort(ints);
        print(ints);

    }

    public static void QuickSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        QuickSrot(arr, 0, arr.length - 1);
    }

    public static void QuickSrot(int[] arr, int l, int r) {

        if (l<r){

            int[] p = partition(arr, l, r);

            QuickSrot(arr, l, p[0]-1);
            QuickSrot(arr, p[1]++, r);
        }

    }

    public static int[] partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;

        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        swap(arr, more, r);

        return new int[]{less+1, more};
    }

    public static void swap(int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void print(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

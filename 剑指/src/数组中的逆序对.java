/**
 * 逆序对 利用归并比较的过程算出逆序对
 * 每次归并一个数的时候，就能得到大叔所在数组长度个逆序对
 */
public class 数组中的逆序对 {


    public void mergeSort(int[] arr, int l, int r) {
        if (l == r) return;

        int min = (l + r) / 2;
        mergeSort(arr, l, min);
        mergeSort(arr, min + 1, r);

    }

    public void merge(int[] arr, int l, int min, int r) {
        int[] temp = new int[r - l + 1];
        int m = min;
        int end = r;
        int t = r-l;//临时数组的下标
        int count = 0;
        while (m >= l && end >= min + 1) {

            if (arr[m] > arr[end]) {
                count += (end-min);
                temp[t--] = arr[m--];

            }else{
                temp[t--] = arr[r--];
            }

            while (l >= l) {
                temp[t--] = arr[l--];
            }
            while (r >= min + 1) {
                temp[t--] = arr[r--];
            }
            for (int i = 0; i <= r - l; i++) {
                arr[l + i] = temp[i];
            }

        }

    }

}

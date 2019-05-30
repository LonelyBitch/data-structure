package TwoDay;

/**
 * 构建大根堆
 */
public class HeapSort {

    public static void main(String[] args) {

    }

    public static void heapSort(int[] arr) {
        if (arr.length < 2 || arr == null) {
            return;
        }

        //出事构建大根堆
        for (int i = 0; i < arr.length; i++) {
            heapInster(arr, i);
        }

        int size = arr.length;
        swap(arr, 0, --size);

        while (size > 0) {
            heapify(arr, 0, size);
            swap(arr, 0, --size);

        }
    }

    /**
     * 初始构建堆
     *
     * @param arr
     * @param index
     */


    public static void heapInster(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;

        }
    }

    public static void heapify(int[] arr, int index, int size) {

        int left = index * 2 + 1;

        while (left < size) {

            int largest = left + 1 > 0 && arr[left] > arr[left + 1] ? left : left + 1;
            largest = arr[index] > arr[largest] ? index : largest;


            if (largest == index) {
                return;
            }

            swap(arr, largest, index);

            index = largest;

            left = index * 2 + 1;

        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int testTime = 500;
        int maxSize = 10;
        int maxValue = 20;
        boolean successd = true;

        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);

            quickSort(arr1);
            comparator(arr2);

            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        quickSort(arr);
        printArray(arr);

    }

    public static void quickSort(int[] arr) {
        if (arr == null && arr.length == 0) {
            return;
        }

        quickSort(arr, 0, arr.length - 1);

    }

    public static void quickSort(int[] arr, int l, int r) {

        if (l < r) {
            swap(arr,l+ (int) (Math.random() * (r - l + 1)), r);//随机快排 平均期望 O(nlog^n)
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);


        }
    }

    public static int[] partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r; //因为此时moer位置的数化分数

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
        return new int[]{less + 1, more};//因为最后一个位置交换之后 r位置的数来到了more位置
    }


    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {

        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random() - (maxValue * Math.random()));
        }

        return arr;
    }

    public static int[] copyArray(int[] arr) {

        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}

/**
 *
 */
public class 奇数在前偶数在后 {


    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
        int[] ints = partition(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.println(ints[i]);
        }

    }

    public static int[] partition(int[] arr) {

        int r = 0;
        int l = arr.length - 1;

        while (r < l) {

            while (r < l && arr[r] % 2 == 1) {
                r++;

            }
            while (r < l && arr[l] % 2 == 0) {
                l--;

            }

            if (r<l){
                int i = arr[l];
                arr[l] = arr[r];
                arr[r] = i;
            }


        }


        return arr;
    }
}

/**
 * 类似于归并的思想 去往数组里面添加当下最小的数
 */
public class 丑数 {

    public int GetUglyNumber(int n) {
        if (n <= 6) {
            return n;
        }

        int[] arr = new int[n];

        arr[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int nexti2 = arr[i2] * 2;
            int nexti3 = arr[i3] * 3;
            int nexti5 = arr[i5] * 5;

            arr[i] = Math.min(nexti2,Math.min(nexti3,nexti5));
            if (arr[i] ==nexti2) i2++;
            if (arr[i] ==nexti3) i3++;
            if (arr[i] ==nexti5) i5++;


        }

        return arr[n-1];
    }
}

/**
 * 利用异或 用第一个不为零的位去运算
 */
public class 寻找数组中出现次数唯一的数 {

    public int[] findNumebrOnce(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return null;
        }

        int[] ret = new int[2];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        int index = findFirstBit(result);
        if (index<-1){
            return null;
        }

        for(int i=0;i<arr.length;i++){
            if((arr[i]&index)==0)
                ret[0]^=arr[i];
            else
                ret[1]^=arr[i];
        }
        return ret;

    }

    public int findFirstBit(int number) {

        if (number < 0)
            return -1;

        int one = 1;
        while (number != 0) {

            if ((number & 1) == 1) {
                return one;
            } else {
                number = number >> 1;
                one = one * 2;

            }
        }

        return -1;
    }

}

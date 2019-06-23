/**
 * 二进制中1的个数：a&(a-1)的结果会让最右边的1变成0，最终让整个二进数都变成0
 */
public class 二进制中1的个数 {

    public static void main(String[] args) {

        System.out.println(findOne(01011101111));
    }

    public static int findOne(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }

}

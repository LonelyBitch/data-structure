/**
 * 剪绳子的问题
 */
public class 剪绳子 {

    public static void main(String[] args) {
        int i = cutCount2(10);

        System.out.println(i);
    }


    public static int cutCount(int len) {

        //规定三种基本类型剪切的时候发生的情况
        if (len == 0) return 0;
        if (len == 1) return 0;
        if (len == 2) return 1;
        if (len == 3) return 2;

        //初始化长度数组 ， 第i个元素代表i长度的绳子剪切乘积的最大值（用于存储动态规划中的子问题）
        int[] arr = new int[len + 1];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;  //以上是对应长度的最佳切分点 到这几个点以后不再往下切分

        for (int i = 4; i <= len; i++) {//第一层遍历拿到要切分的绳子的长度
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {//第二次遍历 求出对应i长度的最大值
                int num = arr[j] * arr[i - j];
                if (num > max) max = num;
                arr[i] = max;
            }
        }
        return arr[len];
    }

    //贪心策略
    public static int cutCount2(int len) {

        //规定三种基本类型剪切的时候发生的情况
        if (len == 0) return 0;
        if (len == 1) return 0;
        if (len == 2) return 1;
        if (len == 3) return 2;

        int timeofthree = len / 3;
        if (len - timeofthree * 3 == 1) timeofthree--;

        int timeofTwo = (len-timeofthree*3)/2;

        return (int)(Math.pow(3,timeofthree)* Math.pow(2,timeofTwo));

    }

}

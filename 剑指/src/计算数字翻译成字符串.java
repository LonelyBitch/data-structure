import java.lang.reflect.GenericArrayType;

/**
 * 把数字翻译成字符串有多少种可能
 * 计算 f(i)= f(i-1)+f(i-2)
 * 看该位置上的数字能否和前面的数字组合成一个大于10小于25的数字 可以就在+1  本身就+1
 */
public class 计算数字翻译成字符串 {
    public static void main(String[] args) {
        int i = GetTranslationCount(String.valueOf(25));

//        int i = numDecodings(String.valueOf(256252));
        System.out.println(i);
    }

    public static int GetTranslationCount(String number) {
        int[] count = new int[number.length() + 1];
        count[0] = 1;
        count[1] = number.charAt(1) == 0 ? 0 : 1;

        for (int i = 2; i<=number.length(); i++){
            Integer value1 = Integer.valueOf(number.substring(i - 1, i));
            if (value1!=0) count[i]+=count[i-1];


            Integer value2 = Integer.valueOf(number.substring(i-2,i));

            if (value2>=10&&value2<=26){

                count[i] += count[i-2];
            }


        }
        return count[number.length()];

    }

    public static int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            int one = Integer.valueOf(s.substring(i - 1, i));
            if (one != 0)
                dp[i] += dp[i - 1];
            if (s.charAt(i - 2) == '0')
                continue;
            int two = Integer.valueOf(s.substring(i - 2, i));
            if (two <= 26)
                dp[i] += dp[i - 2];
        }
        return dp[n];
    }
}

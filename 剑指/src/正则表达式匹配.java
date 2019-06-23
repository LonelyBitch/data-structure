

public class 正则表达式匹配 {

    public static void main(String[] args) {

    }

    public boolean match(String input, String pattern) {

        if (input == null || pattern == null)
            return false;

        return matchCore(input, 0, pattern, 0);
    }

    public boolean matchCore(String input, int i, String pattern, int p) {
        if ((i == input.length()) && (p == pattern.length())) {
            return true;
        }

        if ((i != input.length()) && (p == pattern.length())) {
            return false;
        }

        if ((i == input.length()) && (p != pattern.length())) {
            return false;
        }

        //如果第二个是*
        if (p + 1 < pattern.length() && (pattern.charAt(p = 1) == '*')) {

            if(input.charAt(i)==pattern.charAt(p)||pattern.charAt(p)=='.'){
                return matchCore(input,++i, pattern, p+2)||//匹配一个
                matchCore(input,++i, pattern, p)|| //匹配很多
                matchCore(input,i, pattern, p+2);// 匹配0个， * 出现0次
            }else {
                //如果第一个字符不匹配 所以只能出现零次
                return  matchCore(input , i , pattern, p+2);
            }
        }
        //如果第二个不是*
        if (input.charAt(i)==pattern.charAt(p)||pattern.charAt(p)=='.'){
            return matchCore(input, ++i , pattern, ++p );
        }
        return false;

    }

}

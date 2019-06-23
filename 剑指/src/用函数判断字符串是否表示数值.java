/**
 * 用函数判断字符串是否表示数值
 * 用一个for循环去遍历整个字符串
 * 分别判断指针所指的位置是否是-+/E/小数点 记录他们出现的数量 超过1次就报错 判断是否出现除了数字之外不是E/e 的字符串
 */
public class 用函数判断字符串是否表示数值 {

    public static void main(String[] args) {

    }

    public boolean ifNumber(char[] str) {

        if (str == null) return false;

        int index = 0;
        int ecount = 0;
        int point = 0;

        //如果第一个字符串是符号就跳过
        if (str[index] == '+' || str[index] == '-') {
            index++;
        }

        for (int i = index; i < str.length; i++) {
            //判断是否是-/+号
            if (str[i] == '+' || str[i] == '-') {
                if (str[i - 1] != 'e' && str[i - 1] != 'E') {
                    return false;
                }
                continue;
            }

            //判断是否是Ee
            if (str[i] == 'e' || str[i] == 'E') {
                ecount++;
                if (ecount > 1)
                    return false;
                if (i == 0 || i == str.length - 1 || str[i - 1] < 48 || str[i - 1] > 57) {
                    return false;
                }
                continue;
            }

            //判断是否是小数点
            if (str[i] == '.') {

                point++;
                if (point > 1)
                    return false;

            }

//            判断是否是其他字符
            if ((str[i] < 48 || str[i] > 57) && (str[i] != 'E' || str[i] != 'e')) {

                return false;
            }


        }

        return true;
    }

}

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 字符串的全排列
 * 递归每次定义一个字符的位置，同时其后面的字符和该位置的字符交换位置
 * 打印完成之后 换回原来的位置  依次回溯的以前
 */
public class 字符串的全排列 {

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) return null;
        char[] chars = str.toCharArray();
        ArrayList<String> res = new ArrayList<>();
        helper(res, chars, 0);

        Collections.sort(res);
        return res;


    }

    public void helper(ArrayList<String> res, char[] chars, int index) {

        if (index == chars.length - 1) {
            res.add(new String(chars));
            return;
        }

        HashSet<Character> set = new HashSet<>();

        for (int j = index; index < chars.length; j++) {
            if (!set.contains(chars[j])) {

                set.add(chars[j]);

                swap(chars, index, j);

                helper(res, chars, index + 1);

                swap(chars, index, j);

            }
        }

    }

    public void swap(char[] chars, int i, int j) {

        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

    }
}



public class 翻转字符串前几位 {

    public void reversalStr(String str, int index) {
        String str1 = str.substring(0, index);

        String str2 = str.substring(index, str.length());
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        String s1 = "";
        for (int i = chars1.length - 1; i > 0; i--) {
            s1 += chars1[i];
        }
        String s2 = "";
        for (int i = chars2.length - 1; i > 0; i--) {
            s2 += chars2[i];
        }




    }

    public static void main(String[] args) {

    }
}

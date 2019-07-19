/**
 * 第一个只出现一次的字母 利用hash的原理
 * 每个字母对应的ASCII码值作为下表
 * 用长度为58的数组记录他们出现的次数
 */
public class 第一个只出现一次的字母 {

    public char FirstReppeating(String str){
        if (str==null) return ' ';

        int[] count = new int[58];
        for (int index = 0; index<str.length(); index++){

            count[(int) str.charAt(index)-65] +=1;
        }

        for (int i =0; i<count.length; i++){

            if (count[str.charAt(i)] ==1) return (char)(count[i]+65);
        }

        return ' ';

    }
}

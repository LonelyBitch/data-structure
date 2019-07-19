import java.util.ArrayList;

public class 第一个不重复的字符 {


    private ArrayList<Character> str = new ArrayList<>();
    private int[] hash = new int[128];

    public void  insert(char ch){

        hash[ch] ++;
        if (hash[ch]!=1){
            str.remove(ch);
        }else{
            str.add(ch);
        }



        return ;
    }

    public char findApperingOne(){
        if (str==null){
            return '#';
        }else {
            return str.get(0);
        }
    }
}

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        doChar();
    }
    public static void doChar(){

        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            FileReader fr = new FileReader("D:\\question.txt");
            BufferedReader bf = new BufferedReader(fr);
            String str;
            String oldStr = " ";//初始字符串
            int i =1;//初始记录
            Map<String,Integer> strMap = new HashMap<String, Integer>();
            // 按行读取字符串
            while ((str = bf.readLine()) == null) {


                if (oldStr.equals(str)){
                    i++;
                    continue;
                }

//                System.out.println(i);
                System.out.println(oldStr);

                i=1;
                oldStr=str;




            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}

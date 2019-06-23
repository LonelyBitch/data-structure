/**
 * 考虑1到n位大叔问题
 */
public class 打印1到n位最大数 {

    public static void main(String[] args) {
        print1toMax(2);
    }

    public static void print1toMax(int n) {
        char[] arr = new char[n];

        //初始化数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = '0';
        }

        print1toMax(arr,0);


    }
    public static void print1toMax(char[] arr,int index){

        if (index==arr.length){
            printNum(arr);
            return ;
        }

        for (int j= 0 ; j<10; j++){

            arr[index] = (char)(j+'0');

            print1toMax(arr,index+1);
        }
    }
    public static void printNum(char[] arr){

        int index = 0;
        while (index<arr.length&& arr[index]=='0'){
            index++;
        }
        while (index<arr.length){
            System.out.print(arr[index++]);
        }
        System.out.println();

    }

}

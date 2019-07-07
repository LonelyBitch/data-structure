/**
 * 定义count 和number 记录相同元素出现的个数 和相应的元素，
 * 下一个元素相同+1，不同-1， 在count==0时 当前元素替换number
 */
public class 元素个数超过数组一半 {

    public static void main(String[] args) {

    }

    public int moreThanHalfNum_Soulation(int[] array) {

        if (array.length == 0 || array == null) return 0;

        int count = 1;
        int number = array[0];
        for (int i = 0; i < array.length; i++) {

          count =   number == array[i] ? count++ : count--;
          if (count==0){
              number = array[i];
              count = 1;
          }


        }
        count=0;
        for (int value : array){
            if (number==value) count++;
        }

        return count>array.length/2? number: 0 ;

    }
}

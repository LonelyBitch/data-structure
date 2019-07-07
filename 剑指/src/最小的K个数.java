import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 用大根堆去维护最小的K个数，大于就去除最大放入该数，
 *
 */
public class 最小的K个数 {

    public ArrayList<Integer> GetLastNoumber_Solution(int[] input, int k ){

        ArrayList<Integer> res = new ArrayList<>();
        if (input==null||k<=0){
            return res;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int value : input){
            if (maxHeap.size()<k){
                maxHeap.offer(value);
            }else {
                if(maxHeap.peek()>value){
                    int temp = maxHeap.poll();
                    temp =0;
                    maxHeap.offer(value);
                }
            }
        }


        res.addAll(maxHeap);
        return res;
    }
}

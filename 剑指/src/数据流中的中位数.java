import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 维护一个大根堆和一个小根堆 中位数由两个堆的堆顶来确定
 */
public class 数据流中的中位数 {

    private int index = 0;

    public int input(int n){


        //创建两个堆
        PriorityQueue<Integer> minHeap =  new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        if (index%2==0){
            minHeap.offer(n);
            maxHeap.offer(minHeap.poll());
        }else {
            maxHeap.offer(n);
            minHeap.offer(maxHeap.poll());
        }

        if (index%2==0){
            return (minHeap.poll()+maxHeap.poll())/2;
        }else{
            return minHeap.poll();
        }
    }
}


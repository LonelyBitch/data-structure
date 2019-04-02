import java.util.PriorityQueue;

public class Less_Money {

    public static Integer lessMoney(int[] arr) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {

            queue.add(arr[i]);

        }

        int sum = 0;
        int cur;
        while (queue.size()>1) {
            cur = queue.poll() + queue.poll();
            sum+=cur;
            queue.add(cur);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 20,10,30 };
        System.out.println(lessMoney(arr));

    }

}

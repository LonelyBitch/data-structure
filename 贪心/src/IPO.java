import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO {

    public static class Node {
        private int p;
        private int c;

        public Node(int p, int c) {
            this.c = c;
            this.p = p;
        }
    }

    public static class MinCostComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {

            return o1.c - o2.c;
        }
    }


    public static class maxProfitComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o2.p - o1.p;
        }
    }

    public static int findMaxImizedCapital(int k, int w, int[] profit, int[] cost) {
        Node[] nodes = new Node[profit.length];

        PriorityQueue<Node> minCostQueue = new PriorityQueue<>();
        PriorityQueue<Node> maxProfitQueue = new PriorityQueue<>();

        for (int i = 0; i < nodes.length; i++) {
            minCostQueue.add(new Node(profit[i], cost[i]));
        }

        for (int i = 0; i <= k; i++) {

            while (minCostQueue.isEmpty() && minCostQueue.peek().c < w) {
                maxProfitQueue.add(minCostQueue.poll());
            }

            if (minCostQueue.isEmpty()) {
                return w;
            }
            w += maxProfitQueue.poll().p;

            return w;
        }

        return w;
    }

}

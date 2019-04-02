import java.util.LinkedList;
import java.util.Queue;

public class IsCBTAndBST {

    public static class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    public static boolean isCBT(Node head) {

        if (head == null) {
            return false;
        }

        Node left = null;
        Node right = null;
        Queue<Node> queue = new LinkedList<Node>();

        boolean leaf = false;
        queue.offer(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            left = head.left;
            right = head.right;

            if ((leaf && (right != null || left != null)) || (left == null && right != null)) {
                return false;
            }
            if (right != null) {
                queue.offer(right);
            }

            if (left != null) {
                queue.offer(left);
            } else {
                leaf = true;
            }

        }
        return true;
    }
}

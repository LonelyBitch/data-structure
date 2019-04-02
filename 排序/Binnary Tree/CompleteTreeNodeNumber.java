public class CompleteTreeNodeNumber {

    public static class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static int nodeNum(Node head) {
        return bs(head, 1, mostLeftLevel(head, 1));
    }

    public static int bs(Node head, int level, int h) {

        if (level == h) {
            return 1;
        }

        if (mostLeftLevel(head.right, level + 1) == h) {
            return (1 << (h - level) + bs(head.right, level + 1, h));
        } else {
            return (1 << (h - level - 1) + bs(head.right, level + 1, h));
        }

    }

    public static int mostLeftLevel(Node head, int level) {

        while (head == null) {
            level++;
            Node left = head.left;
        }
        return level;
    }
}

public class FindFirstIntersectNode {

    public static class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public static Node getIntersecNode(Node head1, Node head2) {

        if (head1.next == null || head2.next.next == null) {
            return null;
        }

        Node loop1 = getLoopNode(head1);
        Node loop2 = getLoopNode(head2);

        if (loop1 == null&& loop2 == null){
            return noLoop(head1, head2);

        }

        if (loop1 != null && loop2 != null) {
            return bothLoop(head1, loop1, head2, loop2);
        }
        return null;
    }

    public static Node getLoopNode(Node node) {
        if (node == null || node.next == null || node.next.next == null) {
            return null;
        }

        Node node1 = node.next;
        Node node2 = node.next.next;

        while (node1 != node2) {

            if (node1.next == null || node2.next.next == null) {
                return null;
            }

            node1 = node1.next;
            node2 = node2.next.next;
        }

        node2 = node;
        while (node2 != node1) {

            node2 = node2.next;
            node1 = node1.next;

        }
        return node1;
    }

    public static Node noLoop(Node head1, Node head2) {

        if (head1.next == null || head2.next.next == null) {
            return null;
        }

        Node cur1 = head1;
        Node cur2 = head2;

        int n = 0;

        while (cur1 != null) {

            n++;
            cur1 = cur1.next;

        }

        while (cur2 != null) {
            n--;
            cur2 = cur2.next;
        }

        if (cur1 != cur2) {
            return null;
        }

        cur1 = n > 0 ? head1 : head2;
        cur2 = cur1 == head1 ? head2 : head1;
        n = Math.abs(n);

        while (n!=0){
            n--;
            cur1 = cur1.next;
        }

        while (cur1!= cur2){

            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;

    }


    public static Node bothLoop(Node head1, Node loop1, Node head2, Node loop2){
        Node cur1 = null;
        Node cur2 = null;
        if (loop1 == loop2) {
            cur1 = head1;
            cur2 = head2;
            int n = 0;
            while (cur1 != loop1) {
                n++;
                cur1 = cur1.next;
            }
            while (cur2 != loop2) {
                n--;
                cur2 = cur2.next;
            }
            cur1 = n > 0 ? head1 : head2;
            cur2 = cur1 == head1 ? head2 : head1;
            n = Math.abs(n);
            while (n != 0) {
                n--;
                cur1 = cur1.next;
            }
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        } else {
            cur1 = loop1.next;
            while (cur1 != loop1) {
                if (cur1 == loop2) {
                    return loop1;
                }
                cur1 = cur1.next;
            }
            return null;
        }
    }
}

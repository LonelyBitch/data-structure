import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndResrtuctTree {

    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static String SerializeByPre(Node head) {

        if (head == null) {
            return "#!";
        }

        String str = head.value + "!";

        str += SerializeByPre(head.left);
        str += SerializeByPre(head.right);

        return str;
    }

    public static Node ReconPreByStr(String str){

        String[] strs= str.split("!");
        Queue<String> queue = new LinkedList<String>();

        for (int i = 0 ; i<strs.length; i++){
            queue.offer(strs[i]);
        }
        return ReconPre(queue);
    }

    public static Node ReconPre(Queue<String> queue){

        String str = queue.poll();

        if (str.equals("#")){
            return null;
        }
        Node head = new Node(Integer.valueOf(str));

        head.left= ReconPre(queue);
        head.right = ReconPre(queue);

        return head;
    }

}

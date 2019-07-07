import org.w3c.dom.NodeList;

/**
 * 判断链表有环 无环 找到入环口
 * 找到链表入环口
 */
public class 找到链表入环口 {

    public static void main(String[] args) {

    }

    public static Node findNode(Node node) {

        if (node == null)
            return null;

        Node p1 = node;
        Node p2 = node;

        while (p2 != null && p2.next != null) {

            p1 = p1.next;
            p2 = p2.next.next;

            if (p1 == p2){
                p2 = node;

                while (p2==p1){
                    p2 = p2.next;
                    p1 = p1.next;
                }
                return p1;
            }

        }


        return null;

    }
}

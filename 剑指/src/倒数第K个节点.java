/**
 * 倒数第k个节点： 让第一个指针提前走K步 第二个指针从头开始走，两个指针同时往前，直到第一个指针走到头
 * <p>
 * 注意： 头结点是否为空，
 * 链表长度是否大于K
 * 是否会有求倒数第0个节点
 */
public class 倒数第K个节点 {

    public static void main(String[] args) {
    }

    public static Node finCutNode(Node head, int k) {

        if (head == null)
            return null;

        Node p1 = head;
        while (head.next != null && k-- > 0) {
            p1 = head.next;
        }

        Node p2 = head;
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}

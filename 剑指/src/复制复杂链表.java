import java.nio.channels.NetworkChannel;

/**
 * 分为三部分， 第一复制链表
 * 第二复制随机链表
 * 第三拆分链表
 */
public class 复制复杂链表 {


    public Node copyList(Node phead) {
        if (phead == null) return phead;

        Node cur = phead;

        while (cur != null) {
            Node clone = new Node(cur.value);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }

        cur = phead;
        while (cur != null) {

            Node clone = cur.next;

            if (cur.random != null) {

                clone.random = cur.random.next;
            }
            cur = clone.next;
        }

        cur = phead;
        Node pCloneNode = phead.next;

        while (cur != null) {
            Node temp = cur.next;
            cur.next = temp.next;

            cur = temp;
        }

        return pCloneNode;
    }

}

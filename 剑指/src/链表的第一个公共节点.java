public class 链表的第一个公共节点 {
    public static void main(String[] args) {
        findFirstCommonNode(new Node(12),new Node(32));
    }

    public static Node findFirstCommonNode(Node phead1, Node phead2) {

        if (phead1 == null || phead2 == null) {
            return null;

        }

        int len1 = findLenth(phead1);
        int len2 = findLenth(phead2);

        if (len1 > len2) {
            int i = len1 - len2;
            while (i > 0) {
                i--;
                phead1 = phead1.next;

            }
        } else {

            int i = len2 - len1;
            while (i > 0) {
                i--;
                phead2 = phead2.next;

            }
        }

        while (phead1 != phead2 && phead1 != null) {
            phead1 = phead1.next;
            phead2 = phead2.next;

        }
        return phead1;
    }


    public static int findLenth(Node phead) {

        int lenth = 0;
        Node current = phead;
        while (current != null) {

            current = current.next;
            lenth += 1;

        }
        return lenth;
    }
}

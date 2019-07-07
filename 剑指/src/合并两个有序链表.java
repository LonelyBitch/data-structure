/**
 * 合并连个有序链表： 递归的去合并两个链表，类似于归并排序
 */
public class 合并两个有序链表 {

    public Node Merge(Node node1, Node node2 ){

        if (node1==null){
            return node1;
        }

        if (node2==null){
            return node2;
        }

        Node newHead = null;

        if (node1.value<=node2.value){
            newHead = node1;
            newHead.next = Merge(node1.next,node2);

        }else {
            newHead = node2;
            newHead.next = Merge(node1,node2.next);
        }

        return newHead;
    }
}

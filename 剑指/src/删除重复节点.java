import java.time.Period;

/**
 * 删除链表中的重复节点
 * 首先新建节点防止头结点被删除
 * 判断节点的下一节点的值是否和当前值相同
 */
public class 删除重复节点 {
    public class Node {

         int value ;
         Node next;

        public Node(int i){
            this.value = i;
        }
    }
    public static void main(String[] args) {

    }

    public Node deletduplication(Node phead){
        if (phead==null)
            return null;

        Node firstNode = new Node(-1);
        firstNode.next = phead;

        Node preNode = firstNode;

        if (phead.value== phead.next.value){
            int val = phead.value;

            while (val == phead.value){
                phead = phead.next;
            }

            preNode.next = phead;
        }else {
            //如果不相等就 那么就把指针下移
            preNode = phead;
            phead = preNode.next;
        }

        return firstNode.next;
    }
}
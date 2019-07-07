/**
 * 定义三个指针 分别指向前一个节点，指针翻转节点，指针翻转之前指向的下一个节点
 */

public class 翻转链表 {

    public static void main(String[] args) {

    }

    public static Node reverseList(Node head){

        if (head==null || head.next==null) return null;

        Node temp =  null;


        while (head!=null){
            Node nextNode = head.next;

            head.next=temp;

            temp = head;

            head = nextNode;

        }


        return head;
    }
}

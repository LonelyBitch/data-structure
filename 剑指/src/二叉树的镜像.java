import java.util.Stack;

/**
 * 求一棵二叉树的镜像  递归或者非递归的去交换两个子节点的位置
 */
public class 二叉树的镜像 {


    //递归版本
    public void Mirror1(Node head) {

        if (head == null) return;

        head = exchange(head);
        Mirror1(head.left);
        Mirror1(head.right);
    }

    public Node exchange(Node node) {
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        return node;
    }

    //非递归版本
    public void mirror2(Node head) {
        if (head == null) return;

        Stack<Node> stack = new Stack<Node>();

        while (head != null || stack.isEmpty()) {
            while (head != null) {
                Node temp = head.left;
                head.left = head.right;
                head.right = temp;

                stack.push(head);
                
                head = head.left;
            }

            if (!stack.isEmpty()) {

                head = stack.pop();
                head = head.right;

            }
        }
    }

}

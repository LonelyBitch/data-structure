import java.util.Stack;

public class PerInpostTraversal {

    public static class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    //递归的方法解决 写出先序 后序 中续遍历二叉树
    public static void perOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.value + "**");
        perOrderRecur(head.left);
        perOrderRecur(head.right);
    }


    public static void inOrderRecur(Node head){

        if (head==null){
            return;
        }
        inOrderRecur(head.left);
        System.out.println(head.value + "**");
        inOrderRecur(head.right);
    }

    public static void posOrderRecur(Node head){

        if (head==null){
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.value + "**");
    }
    //用压栈的方式解决写出三种遍历方式
    public static void perOrderUnRecur(Node head){

        if (head==null){
            return;
        }

        Stack<Node>  stack = new Stack<Node>();
        stack.push(head);
        while (!stack.isEmpty() || head!=null){
            head = stack.pop();
            System.out.println(head.value+"**");
            if (head.right != null){
                stack.push(head.right);
            }

            if (head.left != null){
                stack.push(head.left);
            }

        }

    }

    public static void inOrderUnRecur(Node head){
        if (head==null){
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || head!=null){

            if (head!=null){
                stack.push(head);
                head = head.left;
            }else {
                head = stack.pop();
                System.out.println(head.value+"**");
                head = head.right;
            }
        }
    }

    public static void posOrderUnRecur1(Node head){

        if (head==null){
            return;
        }

        Stack<Node> stack1 = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();

        stack1.push(head);
        while (!stack1.isEmpty()){

            head = stack1.pop();
            stack2.push(head);

            if(head.left!=null){
                stack1.push(head.left);
            }

            if (head.right!=null){
                stack2.push(head.right);
            }

        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().value + " ");
        }
    }

}

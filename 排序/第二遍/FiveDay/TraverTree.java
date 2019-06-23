package FiveDay;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 三种方式遍历二叉树
 * 先序遍历 ： 先打印头结点 递归左右 压栈：打印头结点 压栈右左
 * 中续遍历：
 * 后序遍历：
 */
public class TraverTree {


    public static class Node {
        private Node leftNode;
        private Node rightNode;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }


    public void PreTraver(Node node) {
        if (node == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while (!stack.isEmpty()) {

            Node head = stack.pop();
            System.out.println(head.value);
            //先压左 后压右
            if (head.rightNode != null) {
                stack.push(head.rightNode);
            }


            if (head.leftNode != null) {
                stack.push(head.leftNode);
            }

        }
    }

    public void OrderTraver(Node node) {

        if (node != null) {
            Stack<Node> stack = new Stack<Node>();

            while (!stack.isEmpty() || node != null) {

                if (node != null) {
                    stack.push(node);
                    node = node.leftNode;
                } else {
                    node = stack.pop();
                    System.out.println(node.value);
                    node = node.rightNode;
                }

            }

        }

    }

    public void posOrderUnRecur1(Node head){

        if (head!= null){

            Stack<Node> stack1 = new Stack<Node>();
            Stack<Node> stack2 = new Stack<Node>();
            stack1.push(head);
            while (!stack1.isEmpty()){

                head = stack1.pop();
                stack2.push(head);

                if (head.leftNode!=null){
                    stack2.push(head.leftNode);
                }
                if (head.rightNode!=null){
                    stack2.push(head.rightNode);
                }

            }
            while (!stack2.isEmpty()){
                System.out.println(stack2.pop());
            }
        }

    }

}

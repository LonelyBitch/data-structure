import java.util.LinkedList;

/**
 *  用一个队列来保存每次弹出节点的左右节点
 */
public class 层序遍历二叉树 {


    public void printTopToBottom(Node head){

        if(head==null){
            return ;
        }

        LinkedList<Node> queue = new LinkedList<Node>();

        queue.add(head);

        while (!queue.isEmpty()){
            Node node = queue.poll();

            System.out.println(node.value);

            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }


        }

    }

}

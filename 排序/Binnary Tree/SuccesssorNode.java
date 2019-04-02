import javafx.scene.Parent;

public class SuccesssorNode {

//    找到一个节点的后继节点,
//    首先判断当前节点的右节点是否为空？ 不空则是右节点最左的点 ： 空 判断该节点的父节点的左节点 是否为该节点 是 就是父节点
// 不是则一路找到该节点的父节点为左节点的节点，即为后继节点

    public static class Node {
        private int value;
        private Node parent;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node getSuccesssorNode(Node node) {

        if (node == null) {
            return null;
        }

        if (node.right != null) {
            return getLeftNode(node.right);
        } else {
            Node parent = node.parent;
            while (parent != null && parent.left != node) {

                parent = parent.parent;
            }

            return parent;
        }


    }

    public static Node getLeftNode(Node node) {
        if (node == null) {
            return node;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.left;
    }


}

/**
 * 判断二叉树是否对称二叉树， 该二叉树是否和该二叉树的镜像否相同。
 */
public class 判断二叉树对称 {

    public boolean isSymmetrical(Node head) {

        if (head == null) {
            return false;
        }


        return isEqual(head.left, head.right);
    }

    public boolean isEqual(Node leftNode, Node rightNode) {

        if (leftNode == null && rightNode == null) {
            return true;
        }


        if (leftNode != null && rightNode != null) {
            return leftNode.value == rightNode.value
                    && isEqual(leftNode.left, rightNode.right)
                    && isEqual(leftNode.right, rightNode.left);
        }

        return false;
    }


}

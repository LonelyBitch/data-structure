/**
 * 二叉树变双向链表
 */
public class 二叉搜索树转换链表 {

    public Node coverNode(Node root) {


        Node lastNode = coverNode(root, null);

        Node pHead = lastNode;
        while (pHead != null && pHead.left != null) {
            pHead = pHead.left;
        }
        return pHead;
    }

    public Node coverNode(Node root, Node lastNode) {
        if (root == null) {
            return null;
        }

        Node cur = root;
        if (root.left != null) {
            lastNode = coverNode(root.left, lastNode);
        }
        //头结点连接左子树和右子树的过程
        cur.left = lastNode;
        if (lastNode != null) {
            lastNode.right = cur;
        }

        lastNode = cur;
        if (lastNode.right != null) {
            lastNode = coverNode(lastNode.right, lastNode);
        }

        return lastNode;

    }
}
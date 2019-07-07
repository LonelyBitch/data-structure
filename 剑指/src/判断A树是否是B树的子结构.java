import javax.swing.tree.TreeNode;
import javax.xml.stream.FactoryConfigurationError;

/**
 * 首先递归的去查找B的根节点是否在A树存在
 * 然后判断子节点是否都相等
 */
public class 判断A树是否是B树的子结构 {


    public boolean HasSubtree(Node head1, Node head2) {
        boolean result = false;

        if (head1 != null && head2 != null) {
            if (head1.value == head2.value) {
                result = doesT1haveT2(head1, head2);
            }

            if (!result) {
                return HasSubtree(head1.left, head2) || HasSubtree(head1.right, head2);
            }
        }


        return result;
    }

    public boolean doesT1haveT2(Node node1, Node node2) {
        if (node1 == null) return false;

        if (node2 == null) return true;

        if (node1.value != node2.value) {
            return false;
        }

        return doesT1haveT2(node1.left, node2.left) && doesT1haveT2(node1.right, node2.right);
    }
}

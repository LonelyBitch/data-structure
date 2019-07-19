import java.util.ArrayList;

public class 第K大节点 {

    public void inOrderRecurSive(Node node, ArrayList<Node> List) {

        if (node == null) return;

        ArrayList<Node> list = List;

        inOrderRecurSive(node.left, list);

        list.add(node);

        inOrderRecurSive(node, list);

    }

    public Node findK(Node node, int k) {
        ArrayList<Node> list = null;
        inOrderRecurSive(node, list);
        int size = list.size();
        if (size <= 0) return null;

        return list.get(k);
    }


}

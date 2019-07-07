import sun.security.krb5.internal.crypto.Des;

/**
 * 序列化 反序列一棵二叉树
 */
public class 序列化一棵二叉树 {

    public String Serialize(Node head) {

        StringBuffer sb = new StringBuffer();
        if (head == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(head.value + ",");
        sb.append(Serialize(head.left));
        sb.append(Serialize(head.right));
        return sb.toString();

    }

    //反序列化一棵二叉树
    public int index = 0;
    public Node Deserialize(String str){

        Node node = null;

        if (str==null||str.length()==0){
            return node;
        }

        int start = index;
        while (str.charAt(index) !=','){

            index++;
        }
        if (!str.substring(start,index).equals("#")){

            node = new Node(Integer.parseInt(str.substring(start,index)));
            node.left = Deserialize(str);
            node.right = Deserialize(str);

        }else{
            index++;
        }


        return node;
    }

}

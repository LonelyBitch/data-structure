import java.util.Arrays;

public class ContructTree {

    public static class Node{

        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }

    }


    public static void main(String[] args) {

        int[] pre = new int[]{1,2,3,4,5,5};
        int[] in  = new int[]{3,2,3,5,4,3};
        reContructTree(pre,in);
    }

    public static Node reContructTree(int[] pre, int[] in){

        if (pre.length==0||in.length==0|| in==null || pre ==null||in.length!=pre.length){
            return null;
        }

        Node node = new Node(pre[0]);

        for (int i = 0; i<in.length; i++){
            if (pre[0] == in[i]){
                node.left = reContructTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                node.right = reContructTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));

            }
        }

        return null;

    }
}

package FiveDay;

/**
 * 判断是否是平衡二叉树
 * 左树和右树的高度相差不会超过一
 * 定义一个返回值类型 用于接收底层返回的信息
 */
public class IsBalanceTree {

    public static class Node {
        private Node leftNode;
        private Node rightNode;
        private int value;

        public Node(int date){
            this.value = date;
        }
    }

    public static class ReturnData {

        private boolean b;
        private int h;

        public ReturnData(boolean b, int h) {
            this.b = b;
            this.h = h;
        }
    }

    public static int isB(Node node){

        return iBProcess(node).h;
    }
    public static ReturnData iBProcess(Node node){
        if (node==null){
            return new ReturnData(true, 0 );
        }

        ReturnData leftDate = iBProcess(node.leftNode);
        if (!leftDate.b){
            return new ReturnData(false, 0 );
        }
        ReturnData rightData = iBProcess(node.rightNode);
        if (!rightData.b){
            return new ReturnData(false, 0 );
        }

        if (Math.abs(leftDate.h-rightData.h)>1){
            return new ReturnData(false, 0 );
        }

        return new ReturnData(true, Math.max(leftDate.h , rightData.h)+1);


    }

}

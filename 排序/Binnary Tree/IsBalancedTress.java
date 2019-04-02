public class IsBalancedTress {

    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static class ReturnData {
        private boolean isB;
        private int value;

        public ReturnData(boolean b, int value) {

            this.isB = b;
            this.value = value;

        }

        public static boolean IsBalance(Node head) {

            return process(head).isB;
        }

        public static ReturnData process(Node head) {

            if (head == null) {
                return new ReturnData(true, 0);
            }
            ReturnData leftData = process(head.left);

            if (!leftData.isB) {
                return new ReturnData(false, 0);
            }

            ReturnData rightData = process(head.right);

            if (!rightData.isB){
                return new ReturnData(false,0);
            }

            if (Math.abs(leftData.value-rightData.value)>0){
                return new ReturnData(false,0);
            }

            return new ReturnData(true, Math.max(leftData.value,rightData.value));
        }
    }
}

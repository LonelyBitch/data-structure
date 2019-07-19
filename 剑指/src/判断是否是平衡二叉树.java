public class 判断是否是平衡二叉树 {

    public class ReturnData {
        private boolean isB;
        private int h;

        public ReturnData(boolean isB, int h) {
            this.h = h;
            this.isB = isB;
        }
    }

    public ReturnData isBalance(Node node) {
        if (node == null) {
            return new ReturnData(true, 0);
        }

        ReturnData lefrData = isBalance(node.left);
        if (!lefrData.isB) return new ReturnData(false, 0);
        ReturnData rightData = isBalance(node.right);
        if (!rightData.isB) return new ReturnData(false, 0);

        if (Math.abs(lefrData.h - rightData.h) > 1) {
            return new ReturnData(false, 0);
        }

        return new ReturnData(true, Math.max(lefrData.h, rightData.h) + 1);
    }
}

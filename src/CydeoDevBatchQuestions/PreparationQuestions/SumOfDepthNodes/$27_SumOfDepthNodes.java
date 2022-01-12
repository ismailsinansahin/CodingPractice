package CydeoDevBatchQuestions.PreparationQuestions.SumOfDepthNodes;

public class $27_SumOfDepthNodes {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(sumOfNodeDepths(root));
    }

    public static int sumOfNodeDepths(TreeNode root) {
        int sum = 0;
        sum += getDepth(root, 0);
        return sum;
    }

    private static int getDepth(TreeNode root, int depth) {
        if(root == null) return 0;
        return depth + getDepth(root.right, depth+1) + getDepth(root.left, depth+1);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}



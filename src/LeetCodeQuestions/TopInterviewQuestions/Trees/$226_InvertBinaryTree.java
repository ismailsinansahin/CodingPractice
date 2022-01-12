package LeetCodeQuestions.TopInterviewQuestions.Trees;

public class $226_InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.left.left.left = new TreeNode(8);
//        root.left.left.right = new TreeNode(9);
//        root.left.right = new TreeNode(5);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(30);
        invertBinaryTree(root);
    }

    public static TreeNode invertBinaryTree(TreeNode root) {
        if(root == null) return root;
        swapNodes(root);
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        return root;
    }

    public static void swapNodes(TreeNode parent){
        TreeNode temp = parent.left;
        parent.left = parent.right;
        parent.right = temp;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}

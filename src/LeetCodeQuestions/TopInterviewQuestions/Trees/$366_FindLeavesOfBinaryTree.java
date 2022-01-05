package LeetCodeQuestions.TopInterviewQuestions.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class $366_FindLeavesOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        System.out.println(findLeaves(root));
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        generateResult(root, result);
        return result;
    }

    private static int generateResult(TreeNode root, List<List<Integer>> result) {

        if (root == null) return -1;

        int left = generateResult(root.left, result);

        int right = generateResult(root.right, result);

        int level = Math.max(left, right) + 1;

        if (result.size() <= level) result.add(new LinkedList<>());

        result.get(level).add(root.val);

        return level;

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}



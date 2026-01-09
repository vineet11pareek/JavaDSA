package leetcode;

import java.util.HashMap;
import java.util.Map;
/*
104. Maximum depth of Binary Tree
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along
the longest path from the root node down to the farthest leaf node.

Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: 3

Example 2:
    Input: root = [1,null,2]
    Output: 2
 */
public class MaximumDepthOfBT104 {
    public static void main(String[] args) {
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t5 = new TreeNode(5, t6, t7);
        TreeNode t4 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2, t4, t5);
        TreeNode t9 = new TreeNode(9);
        TreeNode t8 = new TreeNode(8, t9, null);
        TreeNode t3 = new TreeNode(3, null, t8);
        TreeNode t1 = new TreeNode(1, null, t3);
        maxDepth(t1);

    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return (lh>=rh?lh:rh)+1;


    }
}

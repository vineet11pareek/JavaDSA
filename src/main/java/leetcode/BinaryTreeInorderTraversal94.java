package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
94.Binary Tree Inorder Traversal

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
    Input: root = [1,null,2,3]
    Output: [1,3,2]

Example 2:
    Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
    Output: [4,2,6,5,7,1,3,9,8]

Example 3:
    Input: root = []
    Output: []

Example 4:
    Input: root = [1]
    Output: [1]
 */
public class BinaryTreeInorderTraversal94 {
    public static void main(String[] args) {
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t5 = new TreeNode(5, t6, t7);
        TreeNode t4 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2, t4, t5);
        TreeNode t9 = new TreeNode(9);
        TreeNode t8 = new TreeNode(8, t9, null);
        TreeNode t3 = new TreeNode(3, null, t8);
        TreeNode t1 = new TreeNode(1, t2, t3);
        List<Integer> l = new ArrayList<>();
        inorderTraversal(t1, l);


    }

    public static void inorderTraversal(TreeNode root, List list) {

        if (root == null) return;


        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);

    }

}

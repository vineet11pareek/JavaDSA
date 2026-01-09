package leetcode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/*
101.Symmentric Tree

Given the root of a binary tree,
check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
    Input: root = [1,2,2,3,4,4,3]
    Output: true

Example 2:
    Input: root = [1,2,2,null,3,null,3]
    Output: false

 */
public class SymmentricTree101 {
    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2, t3, t4);

        TreeNode t22 = new TreeNode(2,t4,t3);
        TreeNode t1 = new TreeNode(1, t2, t22);
        System.out.println(isSymmetric(t1));
    }
    public static boolean isSymmetric(TreeNode root) {

        return isSymmetricNode(root.left,root.right);
    }
    public static boolean isSymmetricNode(TreeNode l,TreeNode r) {

        if(l ==null && r==null)
            return true;
        if(l ==null || r==null)
            return false;
        if(l.val !=r.val)
            return false;
        return isSymmetricNode(l.left,r.right) && isSymmetricNode(l.right,r.left);
    }

}

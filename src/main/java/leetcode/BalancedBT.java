package leetcode;
/*
110.Balanced Binary Tree

Given a binary tree, determine if it is height-balanced.

Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: true

Example 2:
    Input: root = [1,2,2,3,3,null,null,4,4]
    Output: false

Example 3:
    Input: root = []
    Output: true

 */
public class BalancedBT {
    public static void main(String[] args) {

        TreeNode t4 = new TreeNode(4);
        TreeNode t44 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3,t4,t44);
        TreeNode t33 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2,t3,t33);
        TreeNode t22 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1,t2,t22);



        System.out.println(isBalanced(t1));


    }
    public static boolean isBalanced(TreeNode root) {
        if(root ==null)
            return true;

        int lCount = getNode(root.left);
        int rCount = getNode(root.right);
        if(Math.abs(lCount-rCount)>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int getNode(TreeNode node){
        if(node==null){
            return 0;
        }

        return 1 + Math.max(getNode(node.left),getNode(node.right));
    }

}

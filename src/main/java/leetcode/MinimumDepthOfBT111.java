package leetcode;

/*111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from
the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: 2

Example 2:
    Input: root = [2,null,3,null,4,null,5,null,6]
    Output: 5

*/
public class MinimumDepthOfBT111 {
    public static void main(String[] args) {
        TreeNode t9 = new TreeNode(9);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        TreeNode t20 = new TreeNode(20,t15,t7);

        TreeNode t3 = new TreeNode(3, t9, t20);
        System.out.println(minDepth(t3));
        //minDepth(t3);

    }
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        if(root.left ==null)
            return minDepth(root.right) +1;
        if(root.right ==null)
            return minDepth(root.left) +1;

        return Math.min(minDepth(root.left) , minDepth(root.right))+1;

    }

}

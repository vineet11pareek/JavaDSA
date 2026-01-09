package leetcode;
/*
108.Convert Sorted Array to Binary Search Tree
Given an integer array nums where the elements are sorted in ascending order,
convert it to a height-balanced binary search tree.

Example 1:
    Input: nums = [-10,-3,0,5,9]
    Output: [0,-3,9,-10,null,5]
    Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:
    Input: nums = [1,3]
    Output: [3,1]
    Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 */
public class ConverSortedArrayToBST108 {
    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4,5};
        inorder(sortedArrayToBST(nums));
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return insertNode(nums, 0, nums.length - 1);
    }

    public static TreeNode insertNode(int[] nums, int left, int right){
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insertNode(nums, left, mid - 1);
        root.right = insertNode(nums, mid + 1, right);

        return root;

    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

}

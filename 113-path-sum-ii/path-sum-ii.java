/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findPath(root, 0, temp, targetSum, result);
        return result;
    }

    public static void findPath(TreeNode node, int sum, List<Integer> temp, int target, List<List<Integer>> result) {
        if (node == null) return;

        temp.add(node.val);
        sum += node.val;

        // Check for leaf and target match
        if (node.left == null && node.right == null && sum == target) {
            result.add(new ArrayList<>(temp));
        } else {
            findPath(node.left, sum, temp, target, result);
            findPath(node.right, sum, temp, target, result);
        }

        // backtrack
        temp.remove(temp.size() - 1);
    }
}

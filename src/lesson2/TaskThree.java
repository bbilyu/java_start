package lesson2;

import java.util.ArrayList;
import java.util.List;

public class TaskThree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> ans = new ArrayList<>();
            String path = Integer.toString(root.val);
            if (root == null) return ans;
            if (root.left == null && root.right == null) ans.add(path);
            if (root.left != null) dfs(root.left, path, ans);
            if (root.right != null) dfs(root.right, path, ans);

            return ans;
        }

        private void dfs(TreeNode node, String path, List<String> ans) {
            path += "->" + node.val;

            if (node.left == null && node.right == null) {
                ans.add(path);
                return;
            }
            if (node.left != null) dfs(node.left, path, ans);
            if (node.right != null) dfs(node.right, path, ans);

        }
    }
}

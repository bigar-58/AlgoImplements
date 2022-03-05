

import java.util.LinkedList;
import java.util.Queue;

//Implementation of the maximum depth of a given binary tree

public class MaximumDepth {

    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    //Use BFS algorithm to traverse inputted binary tree
    int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;

        queue.add(root);
        while (!queue.isEmpty()) {
            // The number of nodes in the current level of the tree.
            int num = queue.size();

            for (int i = 0; i < num; i++) {
                TreeNode current = queue.remove();
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            level++;
        }

        return level;
    }
    public static void main(String[] args) {

    }
}

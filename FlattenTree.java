public class FlattenTree {

    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode previous = null;

    //Flatten the input tree into a linked list
    public void flatten(TreeNode root) {
        if (root == null) {
            // Base case for the recursion.
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = previous;
        root.left = null;
        previous = root;
    }
    public static void main(String[] args) {

    }
}
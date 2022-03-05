public class InvertTree {

    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    //Invert a binary tree given the root node of the tree
    public TreeNode invertTree(TreeNode root) {
        TreeNode head = root;
        if(root == null) return root; //Base case
        if(root.left == null && root.right == null) return root; //One Node

        //Invert current branch
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        //Recursively apply the invert function
        if(root.left != null ) invertTree(root.left);
        if(root.right != null ) invertTree(root.right);
        return head;

    }

    public static void main(String[] args) {

    }
}

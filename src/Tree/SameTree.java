package tree;

public class SameTree {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) throws IllegalArgumentException {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // Create the first binary tree
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Create the second binary tree
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        try {
            // Check if the two trees are the same
            boolean result = isSameTree(p, q);

            // Print out the result
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            // Handle any exceptions thrown by the isSameTree method
            System.err.println(e.getMessage());
        }
    }
}

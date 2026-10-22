class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long low, long high) {

        if (root == null)
            return true;

        if (root.val <= low || root.val >= high)
            return false;

        return validate(root.left, low, root.val)
                && validate(root.right, root.val, high);
    }
}

class ValidateBST {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        Solution solution = new Solution();

        System.out.println(solution.isValidBST(root));
    }
}
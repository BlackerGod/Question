package Day23;

class TreeNode{
    public int val=0;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BalanceTree {
    public boolean isBalanceTree(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left - right >1 || right - left > 1){
            return false;
        }
        return isBalanceTree(root.left) && isBalanceTree(root.right);
    }
    private static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1+(left > right ? left : right);
    }
}

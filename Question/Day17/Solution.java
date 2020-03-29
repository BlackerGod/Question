package Day17;


import java.util.LinkedList;
import java.util.Queue;

public class Solution {
     static class TreeNode {
         int val = 0;
         TreeNode left = null;
         TreeNode right = null;

         public TreeNode(int val) {
             this.val = val;
         }
     }
    public static void Mirror(TreeNode root) {
        //Queue<TreeNode> tree = new LinkedList<>();
        if(root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode(8);
        TreeNode B = new TreeNode(6);
        TreeNode C = new TreeNode(10);
        TreeNode D = new TreeNode(5);
        TreeNode E = new TreeNode(7);
        TreeNode F = new TreeNode(9);
        TreeNode G = new TreeNode(11);
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        Mirror(A);
    }
}

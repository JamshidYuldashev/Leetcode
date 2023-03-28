package com.example.Tree;

public class Problem_226_InvertBinaryTree {
    public static void main(String[] args) {

    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root==null) return null;
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = invertTree(right);
            root.right = invertTree(left);
            return root;
        }
    }
}

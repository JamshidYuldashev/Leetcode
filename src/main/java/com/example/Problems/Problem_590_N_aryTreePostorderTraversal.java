package com.example.Problems;

import java.util.ArrayList;
import java.util.List;

public class Problem_590_N_aryTreePostorderTraversal {
    public static void main(String[] args) {
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };


    static class Solution {
        ArrayList<Integer> arrayList = new ArrayList<>();
        public List<Integer> postorder(Node root) {
            postOrder(root);
            return arrayList;
        }
        public void postOrder(Node node){
            if (node == null) return;
            for (Node child : node.children) {
                postorder(child);
            }
            arrayList.add(node.val);
        }
    }
}

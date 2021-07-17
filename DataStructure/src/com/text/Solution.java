package com.text;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public boolean isValid(String s) {
        if (s.length()%2 == 1 )
        return false;
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray()){
            if (c == '(' ||c=='[' ||c=='{'){
                dq.push(c);
            }
            else {
                if (dq.peek() == map.get(c)){
                    dq.pop();
                }
                else {return false;}


            }
        }


        return dq.isEmpty();

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
            this.right = right; }
      }


        public List<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> lists = new ArrayList<Integer>();
            mid(root,lists);
            return lists;

        }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> listp = new ArrayList<Integer>();
        ArrayList<Integer> listq = new ArrayList<Integer>();
        mid(p,listp);
        mid(q,listq);

        return listp==listq;



    }
        private void mid(TreeNode node,List<Integer> list){

            if (node == null){
                return;
            }
            mid(node.left,list);

            list.add(node.val);

            mid(node.right,list);


        }
        public int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1 ){
            return 1;
        }

        return fib(n-1)+fib(n-2);
        }




    public static void main(String[] args) {
        Solution solution = new Solution();
        //boolean valid = solution.isValid("([{}])");
        //System.out.println(valid);
        int fib = solution.fib(44);
        System.out.println(fib);


    }
}

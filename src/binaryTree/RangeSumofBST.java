/*
Given the root node of a binary search tree and two integers low and high,
return the sum of values of all nodes with a value in the inclusive range [low, high].

               10
            /      \
          5        15
        /  \      /   \
       3    7   13    18
     /     /
     1    6

Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
 */

package binaryTree;

import binarySearchTree.TreeNode;

public class RangeSumofBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root == null){
            return 0;
        }
        else if(root.val>=low && root.val<=high){
            sum += root.val + rangeSumBST(root.left, low, high) +
                    rangeSumBST(root.right,low,high);
        }
        else{
            sum+=rangeSumBST(root.left, low, high) + rangeSumBST(root.right,low,high);
        }

        return sum;

    }
}

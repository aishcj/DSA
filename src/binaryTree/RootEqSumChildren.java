/*
Root Equals Sum of Children

       10
     /    \
    4      6

Input: root = [10,4,6]
Output: true
Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
10 is equal to 4 + 6, so we return true.

 */
package binaryTree;

public class RootEqSumChildren {
    public boolean checkTree(TreeNode root) {
        if(root.left.val + root.right.val == root.val)
            return true;
        else
            return false;
    }
}

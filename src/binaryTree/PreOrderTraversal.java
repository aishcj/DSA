/*
   1
     \
      2
     /
    3

Input: root = [1,null,2,3]
Output: [1,2,3]

 */
package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            ans.add(cur.val);
            if(cur.right!=null)
                stack.push(cur.right);
            if(cur.left!=null)
                stack.push(cur.left);
        }

        return ans;
    }
}

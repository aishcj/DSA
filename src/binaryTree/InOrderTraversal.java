/*
   1
     \
      2
     /
    3

Input: root = [1,null,2,3]
Output: [1,3,2]
 */
package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        while(true){
            if(root!=null){
                stack.push(root);
                root = root.left;
            }
            else{
                if(stack.isEmpty())
                    break;
                root = stack.pop();
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }
}

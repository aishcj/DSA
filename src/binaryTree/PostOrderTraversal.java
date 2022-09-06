/*
   1
     \
      2
     /
    3

 Input: root = [1,null,2,3]
Output: [3,2,1]
 */
package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s1= new Stack();
        Stack<TreeNode> s2= new Stack();
        List<Integer> ans = new ArrayList<>();
        if(root==null)
            return ans;
        s1.push(root);
        while(!s1.isEmpty()){
            root = s1.pop();
            s2.push(root);
            if(root.left!=null)
                s1.push(root.left);
            if(root.right!=null)
                s1.push(root.right);
        }

        while(!s2.isEmpty()){
            root = s2.pop();
            ans.add(root.val);
        }

        return ans;
    }
}

/*
         3
       /   \
      9    20
         /    \
        15    7

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
 */
package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i =0; i<size; i++){
                TreeNode current = q.poll();
                currentLevel.add(current.val);
                if(current.left!=null)
                    q.offer(current.left);
                if(current.right!=null)
                    q.offer(current.right);
            }
            ans.add(currentLevel);
        }

        return ans;

    }
}

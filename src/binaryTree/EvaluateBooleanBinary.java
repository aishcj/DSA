/*
     OR                  OR              TRUE
   /   \               /    \
 True  AND          True    False
      /   \
  False   True


Input: root = [2,1,3,null,null,0,1]
Output: true
Explanation: The above diagram illustrates the evaluation process.
The AND node evaluates to False AND True = False.
The OR node evaluates to True OR False = True.
The root node evaluates to True, so we return true.
 */
package binaryTree;

public class EvaluateBooleanBinary {
    public boolean evaluateTree(TreeNode root) {
        if(root.val==0)
            return false;
        else if(root.val==1)
            return true;
        boolean l = evaluateTree(root.left);
        boolean r = evaluateTree(root.right);

        return (root.val==2)? l|r : l&r;
    }
}

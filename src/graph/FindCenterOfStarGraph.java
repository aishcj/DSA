/*
      4
      |
      2
    /   \
   1    3

Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
 */
package graph;

public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        int val =0;
        for(int i=1; i<edges.length; i++){
            if(edges[0][0]==edges[i][0] || edges[0][0]==edges[i][1])
                val = edges[0][0];
            else if(edges[0][1]==edges[i][0] || edges[0][1]==edges[i][1])
                val = edges[0][1];
            else
                val = -1;
        }
        return val;

    }
}

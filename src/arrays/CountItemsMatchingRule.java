/*
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */
package arrays;

import java.util.List;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = items.size();
        int count = 0;
        for(int i =0; i<n; i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
                count++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
                count++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
                count++;
        }

        return count;
    }
}

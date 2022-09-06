package arrays;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<len; i++){
            ans.add(index[i],nums[i]);
        }
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = ans.get(i);
        }
        return target;
    }
}

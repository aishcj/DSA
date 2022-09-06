package arrays;

public class NumSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] count = new int[size];
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(nums[i]>nums[j])
                    count[i]++;
                else if(nums[i]< nums[j])
                    count[j]++;
                else
                    continue;
            }
        }
        return count;
    }
}

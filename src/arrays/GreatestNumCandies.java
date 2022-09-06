package arrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max = Arrays.stream(candies).max().getAsInt();
        int n = candies.length;
        int max=0;
        for(int i=0; i<n; i++){
            if(candies[i]> max)
                max=candies[i];
        }
        List<Boolean> result = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
}

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        try {
            Map<Integer, Integer> nummap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) 
            {
                nummap.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) 
            {
                int rem = target - nums[i];
                if (nummap.containsKey(rem) && nummap.get(rem) != i)
                {
                    return new int[]{i, nummap.get(rem)};
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

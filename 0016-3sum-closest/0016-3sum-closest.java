import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        try {
            Arrays.sort(nums);
            int A = Integer.MAX_VALUE;
            int sum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                int j = i + 1;
                int k = nums.length - 1;
                int newTarget = target - nums[i];
                while (j < k) {
                    int theesum = nums[j] + nums[k];
                    if (theesum > newTarget) {
                        if (theesum - newTarget < A) {
                            A = theesum - newTarget;
                            sum = theesum + nums[i];
                        }
                        k--;
                    } else if (theesum < newTarget) {
                        if (newTarget - theesum < A) {
                            A = newTarget - theesum;
                            sum = theesum + nums[i];
                        }
                        j++;
                    } else
                        return theesum + nums[i];
                }
            }
            return sum;
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            return -1; 
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { -1, 2, 1, -4 };
        int target = 1;
        int result = solution.threeSumClosest(nums, target);
        System.out.println("Closest 3Sum: " + result);
    }
}

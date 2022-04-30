import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int i = 0;
        boolean megvan = false;
        while(i < size && megvan == false)
        {
            int keresett = target - nums[i];
            if(keresett >= 0 && i != keresett)
            {
                megvan = true;

            }
            i++;
        }
    }
}
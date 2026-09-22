
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                int j = map.get(complement);
                // Return with smaller index first
                return new int[]{Math.min(i, j), Math.max(i, j)};
            }
            
            map.put(nums[i], i);
        }
        
        // Problem guarantees one solution, so this won't be reached
        return new int[]{};
    }
   
}

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; ++i) {
            int current = nums[i];
            if (hashMap.containsKey(current)) {
                return new int[] {hashMap.get(current), i};
            } else {
                // waiting for this number, record current index.
                hashMap.put(target - current, i);
            }
        }
        return null;
    }
}

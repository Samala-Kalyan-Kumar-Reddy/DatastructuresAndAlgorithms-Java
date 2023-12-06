class Solution {
    public boolean containsDuplicate(int[] nums) {
         Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                return true;
            } else {
                frequencyMap.put(num, 1);
            }
        }
        
        return false;
    }
        
    }
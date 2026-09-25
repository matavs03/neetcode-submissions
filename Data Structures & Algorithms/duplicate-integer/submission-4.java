class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> mapa = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mapa.containsKey(nums[i])) return true;
            mapa.put(nums[i], 1);
        }
        return false;
    }
}
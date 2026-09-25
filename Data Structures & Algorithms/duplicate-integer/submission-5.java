class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mapa = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            boolean postoji = mapa.add(nums[i]);
            if(!postoji) return !postoji;
        }
        return false;
    }
}
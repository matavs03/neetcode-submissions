class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] niz = new int[2];
        Map<Integer, Integer> mapa = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int razlika = target - nums[i];
            if(mapa.containsKey(razlika)) return new int[]{mapa.get(razlika), i};
            else mapa.put(nums[i], i); 
        }
        return niz;
    }
}

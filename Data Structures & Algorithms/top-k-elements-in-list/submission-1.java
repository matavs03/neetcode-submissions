class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int[] niz = new int[k];
        for(int i=0;i<k;i++){
            int max = Collections.max(map.values());
            
            for(Integer in: map.keySet()){
                if(map.get(in)==max){
                    niz[i] = in;
                    map.remove(in);
                    break;
                }
            }
        }
        return niz;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max = 0;
        for(int i: set){
            int brojac = 0;
            if(!set.contains(i-1)){
                brojac++;
                int j = i;
                while(set.contains(j+1)){
                    brojac++;
                    j++;
                }
                if(brojac>max) max = brojac;
            }
            
        }
        return max;
    }
}

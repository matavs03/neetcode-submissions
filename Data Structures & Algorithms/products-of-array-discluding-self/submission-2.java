class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int pr1 = 1;
        int pr2 = 1;
        for(int i=0;i<nums.length;i++){
            res[i] = pr1;
            pr1 = pr1 * nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i] = res[i] * pr2;
            pr2 = pr2 * nums[i];
        }
        return res;
    }
}  

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] niz = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int diff = target - numbers[i];
            if(map.containsKey(diff)){
                niz[1] = i+1;
                niz[0] = map.get(diff)+1;
                return niz;
            }
            else{
                map.put(numbers[i], i);
            }
            
        }
        return niz;
    }
}

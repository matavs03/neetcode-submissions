class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            Map<Integer, Integer> mapa = new HashMap<>();

            int target = -nums[i];
            for(int j=i+1;j<nums.length;j++){        
                int diff = target - nums[j];
                if(mapa.getOrDefault(diff, -1) != -1 && mapa.getOrDefault(diff, 0) != j){
                    List<Integer> lista1 = new ArrayList<>();
                    lista1.add(nums[j]);
                    lista1.add(diff);
                    lista1.add(nums[i]);
                    set.add(lista1);
                }
                else{
                    mapa.put(nums[j], j);
                }
            }
            
            

        }

        List<List<Integer>> lista = new ArrayList<>(set);
        return lista;
    }
}

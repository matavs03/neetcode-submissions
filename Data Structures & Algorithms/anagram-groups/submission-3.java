class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapa = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] niz = strs[i].toCharArray();
            Arrays.sort(niz);
            String s = new String(niz);
            List<String> lista = mapa.getOrDefault(s, new ArrayList<>());
            lista.add(strs[i]);
            mapa.put(s, lista);
        }
        return new ArrayList<>(mapa.values());
    }
}

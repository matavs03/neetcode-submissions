class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> mapaS = convertToMap(s);
        Map<Character, Integer> mapaT = convertToMap(t);
        return mapaS.equals(mapaT);
    }

    private Map<Character, Integer> convertToMap(String s){
        Map<Character, Integer> mapa = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mapa.put(s.charAt(i), mapa.getOrDefault(s.charAt(i), 0) + 1);
        }
        return mapa;
    }
}

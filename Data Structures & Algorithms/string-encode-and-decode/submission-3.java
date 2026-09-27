class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for(String str: strs){
            int len = str.length();
            s = s + len + "#" + str;
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int prosli = 0;
        int i = 0;
        while(i<str.length()){
            if(str.charAt(i)=='#'){
                int broj = Integer.parseInt(str.substring(prosli, i));
                prosli = i+broj+1;
                String s = str.substring(i+1, i+broj+1);
                list.add(s);
                i = i+broj+1;
            }
          i++;
        }
        return list;
    }
}

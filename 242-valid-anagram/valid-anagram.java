class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            hs.put(c1,hs.getOrDefault(c1,0)+1);
            hs.put(c2,hs.getOrDefault(c2,0)-1);
        }

        for(int count:hs.values()){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
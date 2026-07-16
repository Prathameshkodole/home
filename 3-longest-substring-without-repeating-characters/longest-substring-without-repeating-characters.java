class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> hs = new HashSet<>();
       int i=0;
       int j=0;
       int len=0;
       while(j<s.length()){
        if(!hs.contains(s.charAt(j))){
            hs.add(s.charAt(j));
            j++;
            if(len<hs.size()){
                len=hs.size();
            }
            
        }else{
            while(hs.contains(s.charAt(j))){
                if(len<hs.size()){
                    len=hs.size();
                }
                hs.remove(s.charAt(i));
                
                i++;
            }
            
        }
       }
       return len;

    }
}
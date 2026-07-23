class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups = new HashMap<>();

        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedKey = new String(ch);

            if(!groups.containsKey(sortedKey)){
                groups.put(sortedKey,new ArrayList<>());
            }
            groups.get(sortedKey).add(str);

        }

        return new ArrayList<>(groups.values());
    }
}
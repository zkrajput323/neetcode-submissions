class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>, List<String>> bMap = new HashMap<>();
        

        
        for(String str:strs){
            HashMap<Character,Integer> fMap = new HashMap<>();

            char[] c = str.toCharArray();
            
            for(int i=0;i<c.length;i++){

                if(fMap.containsKey(c[i])){
                    fMap.put(c[i],fMap.getOrDefault(c[i],0)+1);
                }else{
                    fMap.put(c[i],1);
                }
            }

            if(bMap.containsKey(fMap) == false){
                List<String> list = new ArrayList<>();
                list.add(str);
                bMap.put(fMap,list);

            }else{
                List<String> list = bMap.get(fMap);
                list.add(str);
    
            }


        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> ls: bMap.values()){
                result.add(ls);
        }
        
        return result;
    }
}

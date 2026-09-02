class Solution {
    public boolean isAnagram(String s, String t) {
        
          if(s.length() != t.length()){
            return false;
        }
        
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        

        for(char c1: s1){
            map1.put(c1,(map1.getOrDefault(c1,0)+1));
        }

        for(char c2:t1){
            
           if(map1.containsKey(c2) == false){
            return false;
           }

           if(map1.get(c2) == 1){
             map1.remove(c2);
           }else{

            map1.put(c2, map1.get(c2)-1);
           }
  

        }


    return map1.isEmpty();

    }
}

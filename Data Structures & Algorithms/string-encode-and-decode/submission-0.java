class Solution {

    public String encode(List<String> strs) {
       // String encodeString = "";
        StringBuilder sb = new StringBuilder();

        for(String str: strs){
            sb.append(str.length()).append('#').append(str);
            // int length = str.length();
            // encodeString += length+"#"+str;
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> dString = new ArrayList<>();

        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                   j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+length);
            dString.add(word);
            i = j+1+length;
           
        }
        return dString;

    }
}

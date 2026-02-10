class Solution {
    public String reverseWords(String s) {
        s= s.trim();
         String[] stringArray = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int lastIndex=stringArray.length-1;
        for(int i=lastIndex; i>=0; i--){
            if(stringArray[i] == " ")continue;
            sb.append(stringArray[i]);
            if(i!= 0)
            sb.append(" ");
        }
        return sb.toString();
    }
}
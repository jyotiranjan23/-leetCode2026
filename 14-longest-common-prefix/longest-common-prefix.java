class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        String minString;
        String maxString;
        if(s1.length() < s2.length()){
            minString = s1;
            maxString = s2;
        }
        else {
            minString = s2;
            maxString = s1;
        }
        for(int i=0; i<minString.length(); i++){
            if(minString.charAt(i) == maxString.charAt(i)){
                sb.append(minString.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}
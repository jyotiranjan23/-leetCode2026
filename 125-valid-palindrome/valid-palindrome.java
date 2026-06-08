class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int k=0; k<s.length(); k++){
            if((s.charAt(k) >= 97 && s.charAt(k) <= 122) || (s.charAt(k) >= '0' && s.charAt(k) <= '9')){
                sb.append(s.charAt(k));
            }
        }
        int i=0, j=sb.length()-1;
        while (i < j) {
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
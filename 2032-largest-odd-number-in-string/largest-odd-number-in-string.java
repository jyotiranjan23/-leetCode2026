class Solution {
    public String largestOddNumber(String num) {
    String max = "";
       for(int i=0; i<num.length(); i++){
        String n = num.substring(0, i+1);
        int li = n.length()-1;
        if((n.charAt(li) %2) != 0){
            if(n.length() > max.length()){
                max = n;
            }
        }
       }
       return max;
    }
}
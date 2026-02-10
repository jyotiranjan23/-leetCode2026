class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0;
       String result = "";
       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(ch == ')'){
            counter --;
        }
        if(counter != 0){
            result+=ch;
        }
        if (ch == '(') {
            counter++;
        }
        }
        return result;

    }
}
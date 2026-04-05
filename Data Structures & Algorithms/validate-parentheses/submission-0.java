class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
                st.push(c);
            else{
                if(st.isEmpty())
                    return false;
                else if(isMatch(st.peek(), c))
                    st.pop();
                else
                    return false;
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
    public boolean isMatch(char open, char closed){
        if(open == '(' && closed == ')')
            return true;
        else if(open == '{' && closed == '}')
            return true;
        else if(open == '[' && closed == ']')
            return true;
        else
            return false;
    }
}

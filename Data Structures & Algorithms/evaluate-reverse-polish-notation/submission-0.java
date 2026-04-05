class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int op1 = 0, op2 = 0, res = 0;
        for(String s : tokens){
            if(s.equals("+") && st.size() >= 2){
                op1 = st.pop();
                op2 = st.pop();
                res = op1 + op2;
                st.push(res);
            }
            else if(s.equals("*") && st.size() >= 2){
                op1 = st.pop();
                op2 = st.pop();
                res = op1 * op2;
                st.push(res);
            }
            else if(s.equals("-") && st.size() >= 2){
                op1 = st.pop();
                op2 = st.pop();
                res = op2 - op1;
                st.push(res);
            }
            else if(s.equals("/") && st.size() >= 2){
                op1 = st.pop();
                op2 = st.pop();
                res = op2 / op1;
                st.push(res);
            }
            else
                st.push(Integer.parseInt(s));
        }
        return st.pop();
    }
}

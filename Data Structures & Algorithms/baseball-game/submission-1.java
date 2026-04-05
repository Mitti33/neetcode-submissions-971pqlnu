class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int prev = 0;
        Stack<Integer> st = new Stack<>();
        for(String o : operations){
            if(o.equals("+") && st.size() >= 2){
                int top = st.pop();
                int sum = top + st.peek();
                st.push(top);
                st.push(sum);
            }
            else if(o.equals("D") && !st.isEmpty())
                st.push(2 * st.peek());
            else if(o.equals("C") && !st.isEmpty())
                st.pop();
            else {
                st.push(Integer.parseInt(o));
            }
        }
        int res = 0;
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }
}
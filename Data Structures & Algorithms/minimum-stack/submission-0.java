class MinStack {
    private Stack<Long> st;
    private long min; 
    public MinStack() {
        st = new Stack<>();
        //min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(0L);
            min = val;
        }
        else{
            st.push(val - min);
            if(val < min)
                min = val;
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            long pop = st.pop();
            if(pop < 0)
                min = min - pop;
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
            long top = st.peek();
            if(top > 0)
                return (int)(top + min);
            else
                return (int)min;
        }
        return -1;
    }
    
    public int getMin() {
        return (int)min;
    }
}

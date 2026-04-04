// Last updated: 04/04/2026, 23:32:40
class StockSpanner {
    stack<vector<int>> st;
    int currDay;
    public:
    StockSpanner() {
        currDay=-1;
    } 
    int next(int price) {
        int ans=1;
        currDay++;
        while(!st.empty() && price >= st.top()[0]) {
            st.pop();
        } 
        if(st.empty()) {
            ans=currDay+1;
        } else {
            ans=currDay-st.top()[1];
        }
        st.push( {price,currDay});
        return ans;
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */
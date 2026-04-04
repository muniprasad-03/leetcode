// Last updated: 04/04/2026, 23:32:44
class StockSpanner {
    class State {
        int price;
        int span;
        State(int price,int span) {
            this.price=price;
            this.span=span;
        }
    }
    Stack<State> stack;
    public StockSpanner() {
        this.stack=new Stack<>();
    }
    public int next(int price) {
        int result=1;
        while(!stack.isEmpty() && stack.peek().price <= price) {
            result += stack.pop().span;
        }
        stack.push(new State(price,result));
        return result;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
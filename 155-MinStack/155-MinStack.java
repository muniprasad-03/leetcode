// Last updated: 04/04/2026, 23:36:23
class MinStack {
    private Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[] { val, val });  // [value, min]
        } else {
            int currentMin = Math.min(val, stack.peek()[1]); // Compare with the current minimum
            stack.push(new int[] { val, currentMin });
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];  // Return the value part of the top tuple
    }

    public int getMin() {
        return stack.peek()[1];  // Return the minimum part of the top tuple
    }
}

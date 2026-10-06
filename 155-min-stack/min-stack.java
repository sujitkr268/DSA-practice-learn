import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {

        stack = new Stack<>();
        minstack = new Stack<>();

    }

    public void push(int value) {

        stack.push(value);

        if (minstack.isEmpty()) {
            minstack.push(value);
        }
        else {
            minstack.push(Math.min(value, minstack.peek()));
        }
    }

    public void pop() {

        stack.pop();
        minstack.pop();

    }

    public int top() {

        return stack.peek();

    }

    public int getMin() {

        return minstack.peek();

    }
}
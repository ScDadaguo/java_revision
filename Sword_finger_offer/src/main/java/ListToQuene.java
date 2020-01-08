import java.util.Stack;

public class ListToQuene {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        //如果栈2为空
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
            //如果栈2不为空，先清空栈2
        } else {
                return stack2.pop();
        }
    }
}

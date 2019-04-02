import java.util.Stack;

public class DoubleStack  {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void put(Integer i) {
        if (i == null) return;

        stack1.push(i);

    }

    public Integer getNum() {

        if (stack2.isEmpty() && stack1.isEmpty())
            return null;

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}

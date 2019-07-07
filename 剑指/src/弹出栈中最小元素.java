import java.util.Stack;

/**
 * 利用一个栈去记录此时数据栈中的最小元素
 */
public class 弹出栈中最小元素 {

    Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();

    public void push(int d){

        data.push(d);
        min.push(min.isEmpty()? d:Math.min(min.peek(),d));
    }

    public int pop(){
        min.pop();
        return data.pop();
    }

    public int getMin(){
        return min.peek();
    }
}

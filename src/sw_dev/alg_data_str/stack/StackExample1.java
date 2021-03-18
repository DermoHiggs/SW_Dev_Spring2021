package sw_dev.alg_data_str.stack;

import java.util.Stack;

public class StackExample1 {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();
        if(!myStack.empty())
            myStack.pop();
        myStack.push("aaa");
        myStack.push("bbb");
        myStack.push("ccc");

        System.out.println("item was " + myStack.peek());
        System.out.println("item was " + myStack.pop());

    }

}

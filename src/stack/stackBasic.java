package stack;

import java.util.Stack;


public class stackBasic {
    public static void main(String[] args) {
        Stack<Integer> value=new Stack<>();
        value.push(1);
        value.pop();
        value.push(2);
        value.peek();
        value.capacity();

    }
}

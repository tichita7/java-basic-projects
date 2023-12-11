package Collections;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<Integer>();
        
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);


        System.out.println(st.empty());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}

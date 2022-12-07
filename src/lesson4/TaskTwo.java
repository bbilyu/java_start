package lesson4;

import java.util.Stack;

public class TaskTwo {
    class MyQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        public MyQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }

        public void push(int x) {
            in.push(x);
        }

        private void converterInToOut() {
            int size = in.size();

            for (int i = 0; i < size; i++) {
                Integer top = in.pop();
                out.push(top);
            }
        }

        public int pop() {
            if (out.isEmpty()) {
                converterInToOut();
            }

            return out.pop();
        }

        public int peek() {
            if (out.isEmpty()) {
                converterInToOut();
            }

            return out.peek();
        }

        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}

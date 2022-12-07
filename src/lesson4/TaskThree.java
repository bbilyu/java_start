package lesson4;

import java.util.Deque;
import java.util.LinkedList;

public class TaskThree {
    class Solution {
        public String simplifyPath(String path) {
            Deque<String> stack = new LinkedList<>();
            StringBuilder sb = new StringBuilder();
            String[] p = path.split("/");

            for (String val : p) {

                if (!stack.isEmpty() && val.equals("..")) {
                    stack.pop();

                } else if (!val.equals("") && !val.equals(".") && !val.equals("..")) {
                    stack.push(val);
                }
            }
            if (stack.isEmpty()) return "/";

            while (!stack.isEmpty()) {
                sb.append("/").append(stack.pollLast());
            }

            return sb.toString();
        }
    }
}

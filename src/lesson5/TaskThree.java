package lesson5;

import java.util.HashMap;
import java.util.Stack;

public class TaskThree {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i : nums1) {
                map.computeIfPresent(i, (k, v) -> v + 1);
                if (!map.containsKey(i)) {
                    map.put(i, 1);
                }
            }

            Stack<Integer> stack = new Stack<Integer>();

            for (int i : nums2) {
                if (map.containsKey(i) && map.get(i) > 0) {
                    stack.push(i);
                    map.put(i, map.get(i) - 1);
                }
            }

            int i = 0;
            int[] intersections = new int[stack.size()];

            while (!stack.isEmpty()) {
                intersections[i++] = stack.pop();
            }

            return intersections;
        }
    }
}

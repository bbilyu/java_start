package lesson1;

public class TaskFive {
    class Solution {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            boolean trigger = true;

            while (left < right) {
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }

                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    trigger = false;
                    break;
                }

                left++;
                right--;
            }

            return trigger;
        }
    }
}

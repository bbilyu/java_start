package lesson1;

public class TaskFour {
    class Solution {
        public String reverseWords(String s) {
            int firstDigit = 0;
            int end = s.length() - 1;
            int start = s.length() - 1;
            StringBuilder sb = new StringBuilder();

            while (s.charAt(firstDigit) == ' ') {
                firstDigit++;
            }

            if (start == firstDigit) {
                return s;
            }

            while (start != firstDigit) {
                while (s.charAt(end) == ' ') {
                    end--;
                }

                start = end;

                while (s.charAt(start) != ' ' && start != firstDigit) {
                    start--;
                }

                if (start == firstDigit) {
                    sb.append(s.substring(start, end + 1));
                } else {
                    sb.append(s.substring(start + 1, end + 1));
                    sb.append(" ");
                }

                end = start;

            }

            return sb.toString();
        }
    }
}
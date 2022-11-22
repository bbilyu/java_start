package lesson1;

public class TaskOne {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int lastInd = m + n - 1;

            while (m > 0 && n > 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[lastInd] = nums1[m - 1];
                    m--;
                } else {
                    nums1[lastInd] = nums2[n - 1];
                    n--;
                }
                lastInd--;
            }

            while (n > 0) {
                nums1[lastInd] = nums2[n - 1];
                n--;
                lastInd--;
            }
        }
    }
}

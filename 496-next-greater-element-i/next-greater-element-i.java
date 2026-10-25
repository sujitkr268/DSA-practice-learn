
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        int n1 = nums1.length;
        int n2 = nums2.length;

        for (int i = n2 - 1; i >= 0; i--) {
            int target = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= target) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                map.put(target, -1);
            } else {
                map.put(target, stack.peek());
            }

            stack.push(target);
        }

        int[] result = new int[n1];

        for (int i = 0; i < n1; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}

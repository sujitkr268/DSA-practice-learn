
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1];

        for (int i = 0; i < n1; i++) {
            int target = nums1[i];
            int j = 0;
            int ans = -1;

            // Find target in nums2
            while (j < n2 && nums2[j] != target) {
                j++;
            }

            // Find the next greater element
            for (int k = j + 1; k < n2; k++) {
                if (nums2[k] > target) {
                    ans = nums2[k];
                    break;
                }
            }

            result[i] = ans;
        }

        return result;
    }
}

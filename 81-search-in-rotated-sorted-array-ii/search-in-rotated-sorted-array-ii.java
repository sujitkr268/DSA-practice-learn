class Solution {
    public boolean search(int[] nums, int target) {

        int n = nums.length;

        int l = 0;
        int h = n - 1;

        while (l <= h) {

            int mid = (l + h) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // Duplicates: cannot decide which half is sorted
            if (nums[mid] == nums[l] && nums[l] == nums[h]) {
                l++;
                h--;
            }

            // Right half is sorted
            else if (nums[mid] <= nums[h]) {

                // Target lies inside right sorted half
                if (nums[mid] < target && target <= nums[h]) {
                    l = mid + 1;
                }
                else {
                    h = mid - 1;
                }
            }

            // Left half is sorted
            else {

                // Target lies inside left sorted half
                if (nums[l] <= target && target < nums[mid]) {
                    h = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }

        return false;
    }
}
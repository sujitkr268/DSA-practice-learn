class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {

            int mid = (l + h) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[l] <= nums[mid]) {

                // Target lies inside the sorted left half
                if (nums[l] <= target && target < nums[mid]) {
                    h = mid - 1;
                } 
                else {
                    l = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies inside the sorted right half
                if (nums[mid] < target && target <= nums[h]) {
                    l = mid + 1;
                } 
                else {
                    h = mid - 1;
                }
            }
        }

        return -1;
    }
}
class Solution {
    public int searchInsert(int[] nums, int target)
     {
        int n=nums.length;
        int l=0;int h=n-1;int mid;int ans=n;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]>=target)
            {
                h=mid-1;ans=mid;
            }
            else 
            {
             l=mid+1;  
            }
        }
        return ans;
    }
}
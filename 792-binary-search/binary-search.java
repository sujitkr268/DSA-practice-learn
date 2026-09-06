class Solution {
    public int search(int[] nums, int target) 
    {
        int n=nums.length;
        int h=n-1;
        int l=0;
    
        while(l<=h)
        {
             int mid=(l+h)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return -1;
    }
    }
class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int floor = findfloor(nums,n,x);
        int ceil = findceil(nums,n,x);
        return new int[] {floor,ceil};
    }

    public int findfloor(int[] nums, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] <= x){
                ans = nums[mid];
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    } 

    public int findceil(int[] nums, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= x){
                ans = nums[mid];
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }


}
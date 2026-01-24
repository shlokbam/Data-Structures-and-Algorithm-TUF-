class Solution {
    private int findmax(int[] v){
        int maxi = Integer.MIN_VALUE;
        int n = v.length;
        for(int i = 0; i<n; i++){
            maxi = Math.max(v[i],maxi);
        }
        return maxi;
    }
    private long clac(int[] nums, int h){
        long hour = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            hour += Math.ceil((double)nums[i]/(double)h);
        }
        return hour;
    }
    public int minimumRateToEatBananas(int[] nums, int h) {
        int low = 1;
        int high = findmax(nums);
        while(low<=high){
            int mid = (high+low)/2;
            long hour = clac(nums,mid);
            if(hour<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
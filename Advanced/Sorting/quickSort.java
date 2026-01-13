class Solution {
    public int[] quickSort(int[] nums) {
        quciksorthelper(nums,0,nums.length-1);
        return nums;
    }

    public void quciksorthelper(int[] arr, int low, int high){
        if(low<high){
            int p_index = partition(arr,low,high);
            quciksorthelper(arr,low,p_index-1);
            quciksorthelper(arr,p_index+1,high);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int low, int high){
        int randomIndex = low + new Random().nextInt(high - low + 1);
        swap(arr, low, randomIndex);
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i] <= pivot && i<= high-1){
                i++;
            }
            while(arr[j] > pivot && j>= low+1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
}
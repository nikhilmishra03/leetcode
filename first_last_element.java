class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1 };
        int start = position(nums , target , true);
        int end = position(nums , target , false);
        ans[0] = start ; ans[1] = end ; 
        return ans ; 
    }
    int position (int[] nums , int target  , boolean findLeft){
        int ans = -1; 
        int start = 0 ;
        int end = nums.length -1 ;
        while(start <= end ){
          //  int mid = (start+end)/2; CANNOT use because int has a fixed value
            int mid = start + (end - start)/2 ;
            if (nums[mid] == target) {
                ans = mid ; 
                if(findLeft){
                    end = end -1 ;
                }
                else{
                    start = mid + 1 ;
                }
            }
            else if (nums[mid] > target){
                end = mid -1 ;

            }
            else {
             start = mid +1 ;
            }

        }
        return ans ; 
    }
}
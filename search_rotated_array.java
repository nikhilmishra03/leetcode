class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivotFind(nums);
        if(pivot== -1){
            return binarySearch(nums , target , 0 , nums.length-1);
        }
        if(nums[pivot] == target ) {
            return pivot ; 
        }
        if ( target >= nums[0]){
                return binarySearch(nums , target , 0 , pivot-1);
        }
        return binarySearch(nums , target , pivot+1 , nums.length-1);   
    }
   int binarySearch (int[] arr , int target , int start , int end ) {
        while(start <= end ){
          //  int mid = (start+end)/2; CANNOT use because int has a fixed value
            int mid = start + (end - start)/2 ;
            if (arr[mid] == target) {
                return mid ;
            }
            else if (arr[mid] > target){
                end = mid -1 ;

            }
            else {
             start = mid +1 ;
            }

        }
        return -1 ;
    }
     int pivotFind (int[] nums ){
        int start = 0 ;
        int end = nums.length-1; 
       while(start <= end ){
        int mid = start + (end - start)/2 ;
        if(mid < end && nums[mid] > nums[mid+1]){
            return mid ; 
        }
        if(mid > start && nums[mid] < nums[mid-1]){
            return mid-1 ;
        }
        if(nums[mid] <= nums[start]){
            end = mid -1 ;
        }
        else{
            start= mid+1;
        }


       } 
        return -1; 
        
    }
}
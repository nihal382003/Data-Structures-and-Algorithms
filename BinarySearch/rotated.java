class Solution {
    public int search(int[] nums, int target) {
        
         int start = 0;
         int end = nums.length - 1;
         int mid;
        
         while(start <= end) {
              mid = start + (end - start) / 2;
             
             if(nums[mid] == target) {
                 return mid;
             }
             
             else if(nums[mid] > nums[start]) {
                 if(target < nums[mid]  && target > nums[start]) {
                     end = mid - 1;
                 } else {
                    start = mid + 1;     
                  }
             } 
             
             else {
                 if(target > nums[mid] && target < nums[end]) {
                     start = mid + 1;
                 } else {
                     end = mid - 1;
                 }
             }
         }
        
        return -1;
    }
}

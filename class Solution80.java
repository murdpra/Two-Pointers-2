class Solution80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums==null){
            return 0;
        }
        int slow=1,fast=1,count=1;        
        while(fast< nums.length){
            if(nums[fast]==nums[fast-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[slow]=nums[fast];
                slow++;
               
            }
         fast++;
        }
        return slow;
        
    }
}
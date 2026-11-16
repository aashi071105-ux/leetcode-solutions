class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ;
        int finalCount = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i] ;
            while(n != 0){
                n = n / 10 ;
                count++ ;
            }
            if(count % 2 == 0){
                finalCount++ ;
            }
            count = 0 ;
        }
        return finalCount ;
    }
}
class Solution {
    public boolean isPrime(int num){
         if(num < 2) {
            return false;
        }

        for(int i = 2 ; i*i <= num ; i++){
           if(num % i == 0){
            return false ;
           } 
        }
        return true ;
    }
    public int maximumPrimeDifference(int[] nums) {
      int first = -1 , last = -1 ;
      int n = nums.length ;
      for(int i = 0 ; i < n ; i++){
        if(isPrime(nums[i])){
           if(first == -1){
            first = i ;
           }
           last = i ;
        }
      }
      return last-first ;
    }
}
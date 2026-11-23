class Solution {
    public boolean isPrime(int num){
        if(num < 2){
            return false ;
        }
        for(int i = 2 ; i*i <= num ; i++){
            if(num % i == 0){
                return false ;
            }
        }
        return true ;
    }
    public int diagonalPrime(int[][] nums) {
        int max = 0 ;
        int n = nums.length ;  
        for(int i = 0 ; i < n ; i++){

            int a = nums[i][i];
            int b = nums[i][n-1-i];
        
        if(isPrime(a)){
            max = Math.max(a,max);
        }
        if(isPrime(b)){
            max = Math.max(b,max);
        }
      }
      return max;
    }
}
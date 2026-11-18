class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0 ;
        int a = num ;
        for(int i = 1 ; i < num ; i++){
            if(num % i == 0){
                sum = sum + i ;
            }
        }
        if(a == sum){
            return true ;
        }
        return false ;
    }
}
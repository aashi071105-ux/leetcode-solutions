class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left_sum = 0 ;
        int max = 0 ;
        int right_sum = 0 ;       
        for(int i = 0 ; i < k ; i++ ){
            left_sum += cardPoints[i];
        }
            max = left_sum ;

            for(int j= k-1 ; j>=0 ; j-- ){
                left_sum -= cardPoints[j] ; 
                right_sum += cardPoints[cardPoints.length-k+j] ;
                max = Math.max(max, left_sum + right_sum);
            
        }
        return max ;
    }
}


public class Solution {
        static boolean isPalindrome(int x) {
            int digit = 0 ;
            int pal = 0 ;
            int a = x ;
        while(x > 0){
           digit = x % 10 ;
            pal = pal*10 + digit ;
            x = x/10 ;
        }
        if(a == pal){
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}

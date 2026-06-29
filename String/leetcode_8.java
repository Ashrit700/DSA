class Solution {
    public int myAtoi(String s) {
        int index=0;
        int n=s.length();
        int sign=1;
        int ans=0;
        while(index<n&&s.charAt(index)==' '){
            index++;
        }
        if(index==n){
            return 0;
        }
        if(s.charAt(index)=='+'||s.charAt(index)=='-'){
            sign=s.charAt(index)=='+' ? 1:-1;
            index++;

        }
        while(index<n){
            int digit=s.charAt(index)-'0';
            if(digit<0||digit>9){
                break;
            }
            if (ans > Integer.MAX_VALUE / 10 || 
               (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                // If it overflows, return MAX_VALUE for positive, MIN_VALUE for negative
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
           ans=ans*10+digit;
            index++;

        }
        return ans*sign;
        
    }
}
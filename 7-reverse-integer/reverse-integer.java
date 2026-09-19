class Solution {
    public int reverse(int x) {
         int a=x;
    int b=0;
    int c;
    while(a!=0){
        c=a%10;
        if (b > (2147483647 / 10) || b < (-2147483648 / 10)) {
            return 0; // Return 0 if overflow occurs
        }

         

        b=b*10+c;
        a=a/10;

    }
    return b;
    }
}
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>hash=new HashSet<>();

        while(n!=1&&(!hash.contains(n))){
            int sum=0;
            hash.add(n);

            while(n>0){
                sum=sum+(n%10)*(n%10);
                n=n/10;


            }
            n=sum;

            
        }
        return n==1;
       


        
    }
}
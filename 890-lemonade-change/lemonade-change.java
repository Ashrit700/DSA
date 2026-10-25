class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;
        int five=0;
        int twenty=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                ten++;
                if(five<1){
                    return false;
                }
                five--;
            }
            else if(bills[i]==20){
                twenty++;
                if((five>=1&&ten>=1)){
                    five=five-1;
                    ten=ten-1;
                    continue;
                }
                else if(five>=3){
                    five=five-3;
                    continue;
                }
                return false;
                
                
            }
        }
        return true;
        
    }
}
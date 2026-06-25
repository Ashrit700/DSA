class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").trim().toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<=j){

            if(s.charAt(i)!=s.charAt(j)){
               return false;
            }
            else{
                i++;
                j--;
            }

        }  
        return true;      
        
    }
}

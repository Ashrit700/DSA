class Solution {
    public String removeOuterParentheses(String s) {
        int index=0;
        int counter=0;
        int start=0;
        String ans="";
        while(index<s.length()){
            if(s.charAt(index)=='('){
                counter=counter+1;
               
            }
            else if(s.charAt(index)==')'){
                counter=counter-1;
               
            }

            if(counter==0&&index!=0){
                ans=ans+s.substring(start+1,index);
                start=index+1;



            }
             index++;
        }
        return ans;
        
    }
}
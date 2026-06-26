class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String p=strs[strs.length-1];
        int index=0;
        while(index<s.length()){
            if(s.charAt(index)==p.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        if(index==0){
            return "";

        }
        else{
            return s.substring(0,index);
        }
        
    }
}
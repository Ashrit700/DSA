class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        Generate(n,0,0,new StringBuilder(),result);
         return result;
        
    }
    public static  void Generate(int max,int open,int close,StringBuilder current,List<String> result){
        if(current.length()==2*max){
            result.add(current.toString());
            return;
        }
        if(open<max){
            current.append('(');
            Generate(max,open+1,close,current,result);
            current.deleteCharAt(current.length()-1);


        }
        if(close<open){
            current.append(')');
            Generate(max,open,close+1,current,result);
            current.deleteCharAt(current.length()-1);

        }
    } 
}
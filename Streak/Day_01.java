Sequential digits leetcode 1291


class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       String s="123456789";
       
       String Low=String.valueOf(low);
    //    String High=String.valueOf(high);
       int m=Low.length();
    //    int h=High.length();
      ArrayList<Integer>arr=new ArrayList<>();
    //   int i=l;
    //   int k=0;
    for(int l=2;l<=s.length();l++){
        for(int j=0;j<=s.length()-l;j++){
        int k=Integer.parseInt(s.substring(j,j+l));
        String KK=String.valueOf(k);
        if(KK.length()>=m){

        if(k>high) return arr;
        if(k<=high&&k>=low) arr.add(k);
        }

        }
    }
      
      


      
     
      return arr;

        
    }
}
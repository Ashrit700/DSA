import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String s=sc.nextLine();
      long result=0;
      for(int i=0;i<s.length();i++){
        long k=s.charAt(i)-'0';
      if(result==0 && s.charAt(0)=='9'){
        result=9;
      }
      else{
        result=result*10+Math.min(k,9-k);
      }
      }
      System.out.println(result);

}
}
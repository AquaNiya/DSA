//Problem: Ek fn likho sumOfN(int n) jo 1 se n tak ke sabhi numbers ka sum recursively return kare (loop use nahi karna).
public class day2{
  static int SumOfN(int n){
    if(n==0){
      return 0;
    }
    return n + SumOfN(n-1);
  }
  public static void main(String[] args){
    int result =  SumOfN(5);
    System.out.println(result);
  }
}

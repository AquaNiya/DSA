//Problem2: productOfN(int n) jo 1 se n tak sabhi numbers ka product (multiplication) return kare recursively.
//base case kya hoga (hint: multiplication mein 0 nahi, 1 se start hoga base case), aur recursive formula lgega.
public class day2_pb2 {
  static int productOfN(int n){
    if(n==1){
      return 1;
    }
    return n * productOfN(n-1);
  }
  public static void main(String[] args){
    int result = productOfN(5);
    System.out.println(result);
  }
}

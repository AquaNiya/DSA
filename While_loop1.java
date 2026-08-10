public class While_loop1 {
  public static void main(String[] args){
    int n = 5; //Factorial of 5 no.
    int fact = 1; //Initialise factorial 

    while(n>0){
      fact *= n;
      n--;
    }
    System.out.println("Factorial of 5 is: " + fact);
  }
}

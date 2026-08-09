public class For_loop1 {
  //For loop
  public static void main(String[] args) {
    for(int a = 0; a <= 5; a++){
      System.out.println("Hey, this is the no." + a + " iteration");
    }
    //Nested for loop
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        System.out.println("i= " + i + ", j= " + j );
      }
    }
    //Conditionals inside for loops
    for(int k = 1; k <= 10; k++){
      if(k % 2 == 0){
        System.out.println("Even no " + k);
      }else{
        System.out.println("Odd no " + k);
      }
    }
    //Customising for loops
    for(int s = 1; s <= 25 ;s += 5){
      System.out.println("s= " + s);
    }
  }
}
  
  

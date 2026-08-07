//Finding the length of a String using built in fn

// Class containing method to find string length
class Solution {
  //func. to return length of a string
  public int findLength(String s){
    //return length using built-in fn
    return s.length();
  }
}

//Driver class
public class length_str{
  public static void main(String[] args) {
    //Create object of Solution class
    Solution obj = new Solution(); //Because the method findLength belongs to the class Solution.To use that method we need an instance(Solution is the class & obj is the instance tht uses the method) of the class, which is called an object.
    //Input string
    String s = "Hello World!"; //Spaces are counted because a string contains characters, and every character is part of the length
    //Call function and print result
    System.out.println(obj.findLength(s));
  }
}

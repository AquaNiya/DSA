//Accessing individual characters 

//Class containing the method to access character
class Solution{
  //fn to print each character of a string
  public void accessCharacters(String s) //here void is used bcz this method doesn't return anything , it only prints characters of string
  {
    //Loop through each index
    for(int i = 0; i < s.length(); i++){
      //Print the char. at index i
      System.out.println(s.charAt(i)); //charAt(i) returns the character at position i
    }
  }
}
//Driver class
public class Individual_char {
  public static void main (String[] args){
    //Create an object of Solution class
    Solution obj = new Solution();
    //Input string
    String s = "Hello";
    //Call the function
    obj.accessCharacters(s); //the printing happens inside the method 
  }
}

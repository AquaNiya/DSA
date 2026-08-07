//Passing, Returning, & Assigning Strings
class Solution{
  //Function to take a string and return a modified string
  public String modifyString(String s){
    // assigning existing String to another
    String newStr = s;   
    // modifying the new extra text   
    newStr += " World";     
    // returning the modified String
    return newStr;          
  }
}

public class passReturnAssign {
   public static void main(String[] args) {
    //Original String
    String original = "Hello";
    //Create object of Solution class
    Solution obj = new Solution();
    // Pass string to function and store returned value
    String result = obj.modifyString(original);
    
    // Print results
    System.out.println("Original: " + original);
    System.out.println("Returned: " + result);
  }
}

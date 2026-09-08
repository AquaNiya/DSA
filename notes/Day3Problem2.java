//HashMap - "apples" ke against 5 daalna h, phir nikaal ke print karbna h 

import java.util.HashMap;

public class Day3Problem2 {
  public static void main(String[] args){
    HashMap<String, Integer> cupboard = new HashMap<>();
    cupboard.put("Apples", 5);
    cupboard.put("Bananas", 3);
    System.out.println(cupboard.get("Apples"));
    System.out.println(cupboard.get("Bananas"));
  }
}

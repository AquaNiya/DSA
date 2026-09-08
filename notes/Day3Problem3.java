import java.util.HashMap;

public class Day3Problem3 {
  public static void main(String[] args){
    HashMap<String, Integer> cupboard = new HashMap<>();

    int applesCount = cupboard.getOrDefault("apples", 0);
    System.out.println(applesCount);
        
    cupboard.put("apples", applesCount + 1);
    System.out.println(cupboard.get("apples"));

  }
}

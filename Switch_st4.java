// Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
// Ensure only the 1st letter of the answer is capitalised.
//Using Solution class with constraint day>=0 & day<=50

import java.util.Scanner;

class Solution {
  public void whichWeekDay(int day) {
    if ((day >= 0) && (day <= 50)) {
      switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
        default:
          System.out.println("Invalid");
      }
    }
  }
}

public class Switch_st4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter day: ");
    int day = sc.nextInt();

    Solution s = new Solution();
    s.whichWeekDay(day);
    sc.close();
  }
}

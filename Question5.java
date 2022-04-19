import java.util.Scanner;
import java.util.*;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<>();
    int integerCount = in.nextInt();
    for (int i = 1; i < integerCount + 1; i++) {
      al.add(in.nextInt());
    }
    Collections.sort(al, Collections.reverseOrder());

    int currentMax = 0;
    int currentMaxValue = 0;
    int currentCount = 0;
    for (int i = 0; i < al.size(); i++) {
      if (i + 1 != al.size()) {
        if (al.get(i) == al.get(i + 1)) {
          currentCount++;
        }
      }

      if (currentCount > currentMax) {
        currentMax = currentCount;
        currentMaxValue = al.get(i);
      }
      currentCount = 0;
    }
    System.out.print(currentMaxValue);

  }
}

import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Input the number:");
    int number = in.nextInt();
    System.out.print("The answer is:");
    System.out.print(number*number);
    
  }
}

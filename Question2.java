import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Input height in Meters:");
    double height = in.nextDouble();
    System.out.print("Input weight in KG:");
    double weight = in.nextDouble();
    System.out.print("Your BMI is:");
    System.out.print( weight/(height*height) );
  }
}

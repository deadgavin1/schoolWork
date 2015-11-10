// Chapter 5 Question 18
// author: john titor 
// shhhh dont question it
// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage
{
  public static double gasMileage(int miles, double mileage )
  {
    return mileage/miles;
  }
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Miles traveled: ");
    int miles = input.nextInt();
    System.out.print("mileage: ");
    double mileage = input.nextDouble();
    
    input.close();
    
    double mpg = gasMileage(miles, mileage);
    System.out.printf("yuor car sperngt %.1f gallons", mpg);
  }
}

/**************************************
  Author: Megan Riley, Eli Jang, and Shelby Prows
  Course: Computer Programming 1
  Date submitted:11/7/2018
  Purpose: Write a program so that Pierre reduce the size of a recipe by multiplying two fractions.
*************************************/
import  java.util.Scanner;
class Main {
  static Scanner theKeyboard = new Scanner(System.in);
  public static void main(String[] args) {
    
  System.out.println("\nTo convert fractional measures,");

  System.out.println("");

  System.out.print("Enter the fractional measure you want to convert:");
    Fraction oldMeasure = new Fraction();
    oldMeasure.read(theKeyboard);

  System.out.print("\nEnter the fractional amount to reduce/increase it by: ");
    Fraction scaleFactor = new Fraction(1,6);
    scaleFactor.read(theKeyboard);
    Fraction newMeasure = oldMeasure.times(scaleFactor);
    
  System.out.print("\nThe converted measurement is: ");
  newMeasure.print();
  System.out.println();
  System.out.println();
  }
}
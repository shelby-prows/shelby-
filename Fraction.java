import  java.util.Scanner;
import java.lang.Math;
import java.util.StringTokenizer;
public class Fraction extends Object{
  private int myNumerator, myDenominator;
  double scaleFactor;
  public Fraction()
  {
    myNumerator = 0;
    myDenominator = 1;
  }
  public Fraction(int x, int y){
    myNumerator = x;
    myDenominator = y;
  }
  public int getNumerator(){
    return myNumerator;
  }
   public int getDenominator(){
    return myDenominator;
  }
   public void read(Scanner in){
      String point = in.nextLine();
      StringTokenizer parser = new StringTokenizer(point, "/", false);

      if(parser.countTokens() != 2)
          throw new RuntimeException("bad format for coordinate");

      int x = Integer.parseInt(parser.nextToken());
      int y = Integer.parseInt(parser.nextToken());
      myNumerator = x;
      myDenominator = y;
   }
  public Fraction simplify(){
    int gcd = greatestCommonDivisor(myNumerator,myDenominator);
    if(gcd == 0){
      System.exit(0);
    }
    else{
      myNumerator = myNumerator * gcd;
      myDenominator = myDenominator * gcd;
    }
    Fraction simpFrac = new Fraction(myNumerator,myDenominator);
    return simpFrac;
  }
  public Fraction times(Fraction right){
     int resultNumerator = myNumerator * right.getNumerator();
     int resultDenominator = myDenominator * right.getDenominator();
      Fraction result = new Fraction(resultNumerator,resultDenominator);
      result.simplify(); 
      return result;
   }  
  private static int greatestCommonDivisor(int alpha, int beta){
    alpha = Math.abs(alpha);
    beta = Math.abs(beta);
    if (beta == 0)
    return alpha;
    else
    {
    int remainder = alpha % beta;
    return greatestCommonDivisor(beta, remainder);
    }
  }
  public String toString(){
      return "(" + myNumerator + "/" + myDenominator + ")";
   }
  public void print(){
      System.out.print(this.toString());
   }
}
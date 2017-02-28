// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc {
	
	public static void main(String[] args){
	
	}
   public static int add(int a, int b) {
      return a + b;
   }
   
   public static int subtract(int a, int b) {
	   return Math.subtractExact(a, b);
   }
   
   public static int multiply(int a, int b) {
	   return Math.multiplyExact(a, b);
   }
   
   public static int divide(int a, int b) {
	   if (b == 0) {
		   throw new ArithmeticException("Cannot divide by zero.");
	   }
	   
	   return a / b;
   }
}


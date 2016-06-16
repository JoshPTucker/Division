import java.util.Scanner;
 
class Division {
  public static void main(String[] args) {
 
  int a, b, result;
 
  try
  {
	  Scanner input = new Scanner(System.in);
  
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
 
  result = a / b;
 
  System.out.println("Result = " + result);
  }
  catch(ArithmeticException e ){
  System.out.println("You Cant divide by 0");
  }
  
  finally {
    System.out.println("finally block will execute.");
  	}
  
  }

  }
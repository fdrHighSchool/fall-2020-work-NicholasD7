import java.util.Scanner;

class Main {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    boolean quit = true;

    while (quit) {
      System.out.println("enter an equation that you want the computer to solve, or type quit to exit: ");

      String equation1 = in.nextLine();

      if (equation1.equals("quit")) {
        break;                        //asks for the equation, and sets a loop if the user wants to play again or quit.
      }
      produceAnswer(equation1);
    }
  }

  public static String produceAnswer(String equation){

    //creates all the variables neccessary for each part of the equation
    int blank = equation.indexOf(" ");
    int length = equation.length();

    String operand1 = equation.substring(0, blank);
    String symbol = equation.substring((blank + 1), (blank + 2));
    String operand2 = equation.substring((blank + 3), length);

    String whole1 = whole(operand1);
    String whole2 = whole(operand2);

    String num1 = numerator(operand1);
    String num2 = numerator(operand2);

    String den1 = denominator(operand1);
    String den2 = denominator(operand2);

    String string1 = "Whole number 1: " + whole1 + " " + "Numerator 1: " + num1 + " " + "Denominator 1: " + den1;
    String string2 = "Whole number 2: " + whole2 + " " + "Numerator 2: " + num2 + " " + "Denominator 2: " + den2;

    System.out.println(string1);
    System.out.println(string2);

    //sets more variables for each part of the equation for further use throughout the code.
    int intwhole1 = Integer.parseInt(whole1);
    int intwhole2 = Integer.parseInt(whole2);
    int intNum1 = Integer.parseInt(num1);
    int intNum2 = Integer.parseInt(num2);
    int intDen1 = Integer.parseInt(den1);
    int intDen2 = Integer.parseInt(den2);


    //checks if the symbol is addition
    if (symbol.equals("+")) {
      //if the denomenators of both operands are the same, then the code goese to addSameDen method
      if (intDen1 == intDen2)
        addSameDen(intwhole1, intwhole2, intNum1, intNum2, intDen1, intDen2);
      //if the denomenators are different, it goes to addDifDen method
      else {
        addDifDen(intwhole1, intwhole2, intNum1, intNum2, intDen1, intDen2);
      }
    }

    //checks if the symbol is subtraction
    if (symbol.equals("-")) {
      //same denomenators, goes to subSameDen
      if (intDen1 == intDen2)
        subSameDen(intwhole1, intwhole2, intNum1, intNum2, intDen1, intDen2);
      //different denomenators, goes to subDifDen
      else {
        subDifDen(intwhole1, intwhole2, intNum1, intNum2, intDen1, intDen2);
      }
    }

    //checks if the symbol is multiplication
    if (symbol.equals("*")) {
      multiply(intwhole1, intwhole2, intNum1, intNum2, intDen1, intDen2);
    }

    //checks if the symbol is division
    if (symbol.equals("/")) {
      divide(intwhole1, intwhole2, intNum1, intNum2, intDen1, intDen2);
    }

    return (string1);
  }

//tests to see if the equation has whole numbers
 public static String whole(String equation) {
    if(equation.contains("_")) {
      return equation.substring(0, equation.indexOf("_"));
    }
    if(equation.contains("/")){
      return "0";
    }
    else return equation;
  }

  //tests to see what the numerator of the operands in the equation are
  public static String numerator(String equation) {
    if(equation.contains("_")){
      return equation.substring(equation.indexOf("_") + 1, equation.indexOf("/"));

    }else if(equation.contains("/")) {
      return equation.substring(0, equation.indexOf("/"));
    }else {
      return "0";
    }
  }

  //tests to see what the denominators of the equation are
  public static String denominator(String equation) {
    if(equation.contains("/")) {
      return equation.substring(equation.indexOf("/") + 1);
    } else {
      return "1";
    }
  }

  //this methods adds fractions with same denominators
  public static int addSameDen(int whole1, int whole2, int num1, int num2,int den1, int den2) {
    int impropNum1 = (den1 * whole1) + num1;
    int impropNum2 = (den2 * whole2) + num2;

    int finalNum = impropNum1 + impropNum2;

    System.out.println("The result is: " + finalNum + "/" + den1);
    simplify(finalNum, den1);
    return 0;
  }

  //this method adds fractions with different denominators
  public static int addDifDen(int whole1, int whole2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * whole1) + num1;
    int impropNum2 = (den2 * whole2) + num2;

    int newNum1 = impropNum1 * den2;
    int newNum2 = impropNum2 * den1;

    int finalNum = newNum1 + newNum2;
    int finalDen = den1 * den2;

    System.out.println("The result is: " + finalNum + "/" + finalDen);
    simplify(finalNum, finalDen);
    return 0;
  }

  //this method subtracts fractions with same denominators
  public static int subSameDen(int whole1, int whole2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * whole1) + num1;
    int impropNum2 = (den2 * whole2) + num2;

    int finalNum = impropNum1 - impropNum2;

    System.out.println("The result is: " + finalNum + "/" + den1);
    simplify(finalNum, den1);
    return 0;
  }

  //this method subtracts fractions with different denominators
  public static int subDifDen(int whole1, int whole2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * whole1) + num1;
    int impropNum2 = (den2 * whole2) + num2;

    int newNum1 = impropNum1 * den2;
    int newNum2 = impropNum2 * den1;

    int finalNum = newNum1 - newNum2;
    int finalDen = den1 * den2;

    System.out.println("The result is: " + finalNum + "/" + finalDen);
    simplify(finalNum, finalDen);
    return 0;
  }

  //this method multiplies fractions
  public static int multiply(int whole1, int whole2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * whole1) + num1;
    int impropNum2 = (den2 * whole2) + num2;

    int finalNum = impropNum1 * impropNum2;
    int finalDen = den1 * den2;

    System.out.println("The result is: " + finalNum + "/" + finalDen);
    simplify(finalNum, finalDen);
    return 0;
  }

  //this method divides fractions
  public static int divide(int whole1, int whole2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * whole1) + num1;
    int impropNum2 = (den2 * whole2) + num2;

    int finalNum = impropNum1 * den2;
    int finalDen = impropNum2 * den1;

    System.out.println("The result is: " + finalNum + "/" + finalDen);
    simplify(finalNum, finalDen);
    return 0;
  }

  public static int simplify(int finalNum, int finalDen) {

    //finds the greatest common denominator of both fractions in the equation to simplify the solution
    int gcd = 1;

    for (int i = 1; i <= finalDen && i <= finalDen; i++) {

      if (finalNum % i == 0 && finalDen % i == 0)
        gcd = i;
    }

    int newFinalNum = finalNum / gcd;
    int newFinalDen = finalDen / gcd;

    System.out.println("The final solution is: " + newFinalNum + "/" + newFinalDen);

    return(newFinalNum & newFinalDen);
  }
}

//I worked on this code for the past 2 weeks with Joshua

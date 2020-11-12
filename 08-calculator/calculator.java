import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    boolean repeat = true;
    while (repeat) {
      System.out.println("Enter an equation that you want to solve: ");
      String input = in.nextLine();

      produceAnswer(input);
      System.out.println("do you want to ask another equation? (y/n)");
      String input2 = in.nextLine();
      if (input2.equals("n"))
        break;
    }
  }

  public static String produceAnswer(String equation){
    int blank = equation.indexOf(" ");
    int length = equation.length();

    String num1 = equation.substring(0, blank);
    String num2 = equation.substring((blank + 3), length);
    //String symbol = equation.substring((blank + 1), (blank + 2));


    boolean containdash = num2.contains("/");
    boolean containund1 = num2.contains("_");
    boolean containdash2 = num1.contains("/");
    boolean containund2 = num1.contains("_");
    int underscore1 = num1.indexOf("_");
    int underscore2 = num2.indexOf("_");
    String whole1 = "0";
    String whole2 = "0";

    if (underscore1 == -1) {
      whole1 = num1;
    } else {
      whole1 = num1.substring(0, underscore1);
    }
    if (underscore2 == -1) {
      whole2 = num2;
    } else {
      whole2 = num2.substring(0, underscore2);
    }

    if (num1.contains("/")) {
      int dash1 = num1.indexOf("/");
      String numerator1 = num1.substring(underscore1 + 1, dash1);
      String denominator1 = num1.substring(dash1 + 1);
      if (num1.contains("_")) {

        System.out.println("whole number of first operand: " + whole1);
        System.out.println("numerator of the first operand: " + numerator1);
        System.out.println("denominator of the first operand: " + denominator1);
      }
      else {
        System.out.println("whole number of first operand: 0");
        System.out.println("numerator of the first operand: " + numerator1);
        System.out.println("denominator of the first operand: " + denominator1);
      }
    }
    else {
      System.out.println("whole number of first operand: " + whole1);
      System.out.println("numerator of the first operand: 0");
      System.out.println("denominator of the first operand: 1");
    }



    if (containdash == true) {
      int dash2 = num2.indexOf("/");
      String numerator2 = num2.substring(underscore2 + 1, dash2);
      String denominator2 = num2.substring(dash2 + 1);
      if (containund1 == true) {

        System.out.println("whole number of the second operand: " + whole2);
        System.out.println("numerator of the second operand: " + numerator2);
        System.out.println("denominator of the second operand: " + denominator2);
      }
      else {
        System.out.println("whole number of the second operand: 0");
        System.out.println("numerator of the second operand: " + numerator2);
        System.out.println("denominator of the second operand: " + denominator2);
      }
    }
    else {
      System.out.println("whole number of the second operand: " + whole2);
      System.out.println("numerator of the second operand: 0");
      System.out.println("denominator of the second operand: 1");
    }
    return num2;
  }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter an equation that you want to solve: ");
    String input = in.nextLine();

    produceAnswer(input);
  }

  public static String produceAnswer(String equation){
    int blank = equation.indexOf(" ");
    int length = equation.length();

    String num1 = equation.substring(0, blank);
    String symbol = equation.substring((blank + 1), (blank + 2));
    String num2 = equation.substring((blank + 3), length);


    boolean name1 = num2.contains("/");
    boolean name2 = num2.contains("_");
    boolean name3 = num1.contains("/");
    boolean name4 = num1.contains("_");

    if (name3 == true) {
      int dash1 = num1.indexOf("/");
      if (name4 == true) {
        int underscore1 = num1.indexOf("_");
        String whole1 = num1.substring(0, underscore1);
        String numerator1 = num1.substring(underscore1 + 1, dash1);
        String denominator1 = num1.substring(dash1 + 1);

        System.out.println("whole number of first operand: " + whole1);
        System.out.println("numerator of the first operand: " + numerator1);
        System.out.println("denomenator of the first operand: " + denominator1);
      }
    }

    if (name1 == true) {
      int dash2 = num2.indexOf("/");
      if (name2 == true) {
        int underscore2 = num2.indexOf("_");
        String whole2 = num2.substring(0, underscore2);
        String numerator2 = num2.substring(underscore2 + 1, dash2);
        String denominator2 = num2.substring(dash2 + 1);

        System.out.println("whole numebr of the second operand: " + whole2);
        System.out.println("numberator of the second operand: " + numerator2);
        System.out.println("denomenator of the second operand: " + denominator2);
      }
    }
    return (num2);
  }
}

import java.util.Scanner;

class 08-calculator {
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

    System.out.println(num1);
    System.out.println(symbol);
    System.out.println(num2);
    return (num2);
  }
}

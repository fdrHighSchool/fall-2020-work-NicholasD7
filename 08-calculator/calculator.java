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

    //String num1 = equation.substring(0, blank);
    //String symbol = equation.substring((blank + 1), (blank + 2));
    String num2 = equation.substring((blank + 3), length);


    boolean name1 = num2.contains("/");
    boolean name2 = num2.contains("_");

    if (name1 == true) {
      int dash2 = num2.indexOf("/");
      if (name2 == true) {
        int underscore2 = num2.indexOf("_");
        String whole2 = num2.substring((blank + 3), underscore2);
        String numerator2 = num2.substring(underscore2, dash2);

        System.out.print(whole2);
        System.out.println(numerator2);
      }
    }
    return (num2);
  }
}

//produceAnswer("5_3/4 - 6_5/8") returns "whole:6 numerator:5 denominator:8"

//produceAnswer("-3/7 - 20") returns "whole:20 numerator:0 denominator:1"

//produceAnswer(“-32 - 27/21”) returns "whole:0 numerator:27 denominator:21"

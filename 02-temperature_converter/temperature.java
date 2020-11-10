import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Pick F if you want to convert Fahrenhiet to Celsius, Pick C if you want to convert Celsius to Fahrenheit: ");
    String method = in.next();

    if (method.toUpperCase().equals("F")) {
      FarCel();
    } else if (method.toUpperCase().equals("C")){
      CelFar();
    }
  }


  public static void FarCel() {
    Scanner in = new Scanner(System.in);
    System.out.println("pick a number in Fahrenheit to be converted to Celsius: ");
    double Far = in.nextInt();

    double Cel = (Far-32)*5/9;
    System.out.println(Far + "F = " + Cel + "C");
  }


  public static void CelFar() {
    Scanner in = new Scanner(System.in);
    System.out.println("pick a number in Celsius to be converted to Fahrenheit: ");
    double Cel2 = in.nextInt();

    double Far2 = (Cel2*9/5)+32;
    System.out.println(Cel2 + "C = " + Far2 + "F");
  }
}

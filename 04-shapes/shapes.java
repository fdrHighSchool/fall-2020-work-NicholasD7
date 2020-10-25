import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("do you want to find the area of a rectangle or a triangle? ");
    String method = in.next();

    if (method.toLowerCase().equals("rectangle")) {
      System.out.println("what is the length of one side?");
      double x = in.nextDouble();

      System.out.println("what is the length of the other side?");
      double y = in.nextDouble();

      rectangle(x, y);
    }

    else if (method.toLowerCase().equals("triangle")){
      System.out.println("what are the lengths of the legs of the triangle?");//witchcraft //lol
      double x2 = in.nextDouble();//what about the hypotenus lol

      triangle(x2);
    }
  }
  public static double rectangle(double L, double W) {
    System.out.println();

    for(int a = 1; a <= L; a++){
      for(int b = 1; b <= W; b++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.print("The area of the rectangle is: " + L*W);
    return L * W;
  }

  public static double triangle(double L2) {
    System.out.println();
    for(int a = 1; a <= L2; a++){
      for(int b = 1; b <= a; b++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.print("The area of the triangle is: " + L2*L2/2);
    return L2 * L2 / 2;
  }
}

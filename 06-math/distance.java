import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("I will calculate the distance between 2 points.");
    System.out.print("what is the x coordinate of your first point? ");
    int x1 = in.nextInt();

    System.out.print("what is the y coordinate of your first point? ");
    int y1 = in.nextInt();

    System.out.print("what is the x coordinate of your second point? ");
    int x2 = in.nextInt();

    System.out.print("what is the y coordinate of your second point? ");
    int y2 = in.nextInt();

    double subx = x1 - x2;
    double suby = y1 - y2;

    double distance = Math.sqrt(Math.pow(subx, 2) + Math.pow(suby, 2));
    System.out.print(distance);


  }
}

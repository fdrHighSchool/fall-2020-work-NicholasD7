import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("I will calculate the distance between 2 points.");

    System.out.println("what is your first point: ");
    String point1 = in.nextLine();
    // takes in the first point and sets point1 as string.

    System.out.println("what is your second point: ");
    String point2 = in.nextLine();
    //takes in the second point and sets point2 as string also.

    int x1 = xvalue(point1);
    int y1 = yvalue(point1);
    int x2 = xvalue(point2);  //extracts the x and y values of both points
    int y2 = yvalue(point2);

    int subx = x1 - x2;
    int suby = y1 - y2;       //takes the difference of the x and y values

    double distance = Math.sqrt(Math.pow(subx, 2) + Math.pow(suby, 2));
    System.out.println("this is the distance betweent the points: " + distance);
    //calculates the distance with the distance formula

    double taxicab = subx + suby;
    System.out.println("this is the taxicab distance between the two points: " + taxicab);
    //adds the difference of the x and y values

  }
  public static int xvalue(String point) {
    int comma = point.indexOf(",");           //takes the index of the comma in the string
    String xnum = point.substring(1, comma);  //takes in the number between the parenthises and the comma
    return Integer.parseInt(xnum);  //converts the string form of the number to integer
  }
  public static int yvalue(String point) {
    int comma = point.indexOf(",");           //takes the index of the comma
    int paren = point.lastIndexOf(")");       //takes the index of the last parenthesis in the string
    String ynum = point.substring(comma + 2, paren);  //takes in the value between the comma and the parenthises
    return Integer.parseInt(ynum);   //sets the string form of the number to integer
  }
}

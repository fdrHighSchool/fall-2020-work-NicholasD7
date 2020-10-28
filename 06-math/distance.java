import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("I will calculate the distance between 2 points.");

    System.out.println("what is your first point: ");
    String point1 = in.nextLine();

    int comma = point1.indexOf(",");
    int index1 = point1.lastIndexOf(")");
    String x1 = point1.substring(1, comma);
    String y1 = point1.substring(comma + 1, index1);


    System.out.println("what is your second point: ");
    String point2 = in.nextLine();

    int comma2 = point2.indexOf(",");
    int index2 = point2.lastIndexOf(")");
    String x2 = point2.substring(1, comma2);
    String y2 = point2.substring(comma2 + 1, index2);

    int xnum = Integer.parseInt(x1);
    int ynum = Integer.parseInt(y1);
    int x2num = Integer.parseInt(x2);
    int y2num = Integer.parseInt(y2);
    int subx = xnum - x2num;
    int suby = ynum - y2num;

    int distance = (int) Math.sqrt(Math.pow(subx, 2) + Math.pow(suby, 2));
    System.out.print("this is the distance betweent the points: " + distance);
  }
}

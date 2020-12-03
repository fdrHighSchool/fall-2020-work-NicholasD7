import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sum = 0;
    for(int i=0; i < 6; i++) {
      System.out.print("print number: ");
      int num = in.nextInt();

      sum += num;
    }
    double average = sum/5;
    System.out.print(average);
  }
}

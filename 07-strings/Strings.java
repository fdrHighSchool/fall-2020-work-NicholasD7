import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("guess any letter of my name: ");
    String userlet = in.next();

    String name = "Nicholas";

    for (int i = 0; i <= name.length(); i++) {
      String letter = name.charAt(i);
      System.out.println(letter);
      System.out.println("str1 equals to str3:"+letter.equalsIgnoreCase(userlet));
    }
  }
}

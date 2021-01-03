import java.util.*;
public class SelfDivisor {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("chose any number: ");
    int num1 = in.nextInt();
    System.out.println(isSelfDivisor(num1));
    System.out.println(Arrays.toString(firstNumSelfDivisors(10, 3)));
  }

  public static boolean isSelfDivisor(int number) {
    String num = Integer.toString(number);
    int[] digit = new int[num.length()];
    for (int i = 0; i < num.length(); i++) {
      digit[i] = num.charAt(i) - '0';

      if(digit[i] == 0) return false;
      else if(number % digit[i] != 0) return false;
    }
    return true;
  }

  public static int[] firstNumSelfDivisors(int start, int num) {
    int[] arr = new int[num];

    for(int i = 0; i < num; i++) {
      start++;
      if(isSelfDivisor(start)) {
        arr[i] = start;
      }
      else {
        i--;
      }
    }
    return arr;
  }
}

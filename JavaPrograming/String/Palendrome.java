import java.util.Arrays;
import java.util.Scanner;

public class Palendrome {
  public static void main(String[] args) {
    Scanner b = new Scanner(System.in);
    System.out.println("Enter the String");
    String a = b.nextLine();
    //ispaliendrome(a);
    System.out.println(palindrome(a));
  }

  public static void ispaliendrome(String a) {
    if (a.length() == 0) {
      System.out.println("Not palendrome");
    } else {
      for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
          System.out.println("Not palendrome");
        } else {
          continue;
        }
      }
      System.out.println("Palendrome");
    }

  }

  public static boolean palindrome(String a){
    int start=0;
    int end=a.length()-1;
    while(start<end){
      if(a.charAt(start)!=a.charAt(end)){
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}

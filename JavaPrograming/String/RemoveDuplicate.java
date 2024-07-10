import java.util.*;
public class RemoveDuplicate{
  public static void main(String[] args){
    String a=args[0];
    StringBuilder str=new StringBuilder();
    char[] b=a.toCharArray();
    Set<Character> set=new LinkedHashSet<>();

    for(char ch : b){
      set.add(ch);
    }
    for(char ch : set){
      str.append(ch);
    }
    System.out.println(str.toString());
  }
}

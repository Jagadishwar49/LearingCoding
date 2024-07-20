import java.util.*;
public class RemoveDuplicate{
  public static void main(String[] args){
    String a="jagadishwar";
    //StringBuilder str=new StringBuilder();
    String str="";
    char[] b=a.toCharArray();
    Set<Character> set=new LinkedHashSet<>();

    for(char ch : b){
      set.add(ch);
    }
    for(char ch : set){
      str=str + ch;
    }
    System.out.println(str);
  }
}

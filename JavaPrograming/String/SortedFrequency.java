import java.util.Arrays;
import java.util.*;
public class SortedFrequency{
  public static void main(String[] args){
    String a=args[0];
    //System.out.println(frequency(a));
    sortFrequency(a);
  } 
  public static String frequency(String a){
    int[] b=new int[256];
    for(int i=0;i<a.length();i++){
      b[a.charAt(i)]++;
    }
    Arrays.sort(b);
    for(int i=b.length-1;i>=0;i--){
      if(b[i]>0){
        System.out.println(i+" Char is "+(char)i+" frequency is "+b[i]);
      }
    }
    return("Ok");
  }
//using properlogic list sort with map
  public static String sortFrequency(String a){
    Map<Character,Integer> countMap=new HashMap<>();
    for(char c: a.toCharArray()){
      countMap.put(c,countMap.getOrDefault(c,0)+1);
    }

    List<Map.Entry<Character,Integer>> list = new ArrayList<>(countMap.entrySet());

    list.sort((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));
    for(Map.Entry<Character,Integer> j: list){
      System.out.println(j.getKey()+" "+j.getValue());
    }
    return("sortFrequency");
  }
}

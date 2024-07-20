/*
Find first non-repeating character of given String
Input: S = “geeksforgeeks”
Explanation: ‘f’ is the first character in the string which does not repeat.
 */
import java.util.HashMap;
import java.util.Map;

public class NonRepetingChar{
 public static void main(String[] args){
  String a=args[0];
  Map<Character,Integer> map=new HashMap<>();
  for(int i=0;i<a.length();i++){
    if(map.containsKey(a.charAt(i))){
      map.put(a.charAt(i),map.get(a.charAt(i))+1);
    }else{
      map.put(a.charAt(i),1);
    }
  }
  for(int k=0;k<a.length();k++){
    if(map.get(a.charAt(k))==1){
      System.out.println(a.charAt(k));
      break;
    }
  }
} 
}

/*
Check whether two Strings are anagram of each other
Input: str1 = “listen”  str2 = “silent”
Output: “Anagram”
Explanation: All characters of “listen” and “silent” are the same.

Input: str1 = “gram”  str2 = “arm”
Output: “Not Anagram”
 */


import java.util.Arrays;
public class Anogram{
  //Using Arrays
  public static boolean anogramString(String a,String b){
    System.out.println("==========================================================================");
    System.out.println("using array sort and compare");
    System.out.println("==========================================================================");
    char[] arry1=a.toCharArray();
    char[] arry2=b.toCharArray();
    Arrays.sort(arry1);
    Arrays.sort(arry2);

    for (int i = 0; i < arry1.length; i++) {
      if(arry1[i]!=arry2[i]){
        return(false);
      }
    }
    System.out.println("Is anogram");
    return(true);
  }

  //int array[]
  public static String intAnogram(String a,String b){
    System.out.println("==========================================================================");
    System.out.println("using int array to count char");
    System.out.println("==========================================================================");
    int[] c=new int[256];
    if(a.length()!=b.length()){
      return("not Anogram");
    }
    for(int i=0;i<a.length();i++){
      c[a.charAt(i)]++;
      c[b.charAt(i)]--;
    }
    for(int j=0;j<a.length();j++){
      System.out.println(a.charAt(j)+" "+b.charAt(j));
      if(c[a.charAt(j)]!=0 && c[b.charAt(j)]!=0){
        return("not Anogram");
      }
    }
    return("Is anogram");
  }
  public static void main(String [] args){
    String a=args[0];
    String b=args[1];
    System.out.println(anogramString(a,b));
    System.out.println(intAnogram(a,b));
  }
}

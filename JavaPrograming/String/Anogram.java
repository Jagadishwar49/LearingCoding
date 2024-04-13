import java.util.Arrays;

public class Anogram{
  public static boolean anogramString(String a,String b){
    char[] arry1=a.toCharArray();
    char[] arry2=b.toCharArray();
    Arrays.sort(arry1);
    Arrays.sort(arry2);

    System.out.println("After Sort");
    System.out.println(arry1);
    System.out.println(arry2);

    for (int i = 0; i < arry1.length; i++) {
      if(arry1[i]!=arry2[i]){
        return(false);
      }
    }
    System.out.println("Is anogram");
    return(true);
  }
  public static void main(String [] args){
    String a=args[0];
    String b=args[1];
    System.out.println(anogramString(a,b));
  }
}

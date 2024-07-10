public class Charfrequency{
  public static void main(String[] args){
    String a=args[0];
    frequency(a);
  }
  public static String frequency(String a){
    String b=a.replaceAll(" ","");
    int[] c=new int[256];
    for(int i=0;i<b.length();i++){
      c[b.charAt(i)]++;
    }
    //for(int i=0;i<b.length();i++){
      //System.out.println("char of "+b.charAt(i)+" and freq is "+c[b.charAt(i)]);
    //}
    for(int i=0;i<c.length;i++){
      if(c[i]>0){
        System.out.println("char of "+(char)i+" and freq is "+c[i]);
      }
    }
    return("Done");
  }

}

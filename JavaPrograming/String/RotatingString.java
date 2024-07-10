public class RotatingString{
  public static void main(String [] args){
    String a=args[0];
    String b=args[1];
    System.out.println(rotatingCheck(a,b));
  }

  public static String rotatingCheck(String a,String b){
    String c=a+a;
    for(int i=0;i<c.length();i++){
      if(i<b.length()){
        if(b.equals(c.substring(i,i+b.length()))){
          return("String is Rotating");
        }
      }
    }
    return("string");
  }
}

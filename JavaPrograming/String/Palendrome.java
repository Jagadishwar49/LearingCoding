public class Palendrome {
  public static void main(String[] args){
    String a= args[0];
    String b="";
    for(int i =a.length()-1;i>=0;i--){
      b=b+a.charAt(i);
    }
    System.out.println("Reverse String is : "+b);
    if(a.equals(b)){
      System.out.println("String is palendrome");
    }else{
      System.out.println("String is not palendrome");
    }
  }
}

public class Swap{
  public static void main(String [] args){
    int a=10;
    int b=15;
    a=b-a;
    b=b-a;
    a=a+b;
    System.out.println(a + " " + b);
  }
}

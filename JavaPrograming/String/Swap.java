public class Swap{
  public static void main(String [] args){
    int a=10;
    int b=15;
    a=b-a;
    b=b-a;
    a=a+b;
    System.out.println("Value of a : "a + "and b :" + b+ "after swap");

  }
}

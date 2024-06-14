public class PrintEvenWord {
  public static void main(String[] args){
    String a= args[0];
    String []b=a.split(" ");
    String evenCount ="";
    for(int i=0;i<b.length; i++){
      String c=b[i];
      if(c.length() % 2 ==0){
        evenCount=evenCount+" "+c;
      }
    }
    System.out.println("Even word is : "+ evenCount);
  }
}

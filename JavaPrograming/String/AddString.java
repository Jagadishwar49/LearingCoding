public class AddString{
  public static void main(String [] args){
  String a="111";
  String b="222";
  int c=Integer.parseInt(a) + Integer.parseInt(b);
    // Integer.toString(i); String.valueOf(i);
    // https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/javax/xml/bind/DatatypeConverter.html
  System.out.println(c);
  System.out.println(reverseString("Jagadishwar"));
  System.out.println(countWord("Im good boy"));
  System.out.println(compTwoString("Jaga","Gaga"));
}
  //for reversing String
  public static String reverseString(String name){
    String b="";
    for(int i=name.length()-1;i>=0;i--){
      // while reversing one thing to remember
      // 1] first iteration should start with length()-1 because we will get index out of bound
      // 2] condistion shoud be i>=0 becuser we are doing i-- and should not go belo0
      b=b+name.charAt(i);
    }
    return(b);
  }
  public static int countWord(String line){
    String[] a=line.split(" ");
    return(a.length);
  }

  //compare 2 string 
  public static boolean compTwoString(String a,String b){
    if(a.length()!=b.length()){
      return(false);
    }else{
      for(int i=0;i<a.length();i++){
        if(a.charAt(i)!=b.charAt(i)){
          return(false);
        }
      }
      return(true);
    }
  }
}

public class PrintAllSubString{
  public static void main(String[] args){
    for(int i=0;i<args[0].length();i++){
      for(int j=i;j<=args[0].length();j++){
        //j=i because (2,1) substring is not possible
        //substring(0,1,2,3,4,5...n-1)
        System.out.println(i+" "+j);
        System.out.println(args[0].substring(i,j));
      }
    }
  }
}

// code to find optimum way in such that ball will break in that floor example in 100 floor build i need to find in which floor ball will break when droped from it 
import java.lang.Math;
public class TwoBallProblem {
  


public static void main(String[] args){
  String[] breakingPoint = {"false","false","false","false","false","true","true","true","true"};
  System.out.println(floorWhereBallBreak(breakingPoint));

}

public static int floorWhereBallBreak(String[] a){
  int jump = (int)Math.sqrt(a.length);
  int maxJump = 0;
  for (maxJump=jump;maxJump<a.length;maxJump+=jump){
    if(a[maxJump].equals("true")){
      break;
    }
  }
  int start = maxJump-jump;
  for(int i=0;i<jump && start<a.length ; i++,start++){
    if(a[start].equals("true")){
      return((start));
    }
  }
  return(-1);


}
}

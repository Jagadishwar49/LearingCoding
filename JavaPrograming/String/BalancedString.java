import java.util.Stack;
public class BalancedString{
  public static void main(String[] args){
    //String a=args[0];
    String a="[({))]";
    int n=a.length();
    Stack<Character> s = new Stack<>();
    for(int i=0;i<a.length();i++){
      char b=a.charAt(i);
      if(b=='[' || b=='{' ||b=='('){
        s.push(b);
      }
      else if(b==']' || b=='}' ||b==')'){
        if(s.empty()){
          System.out.println("Not Balalenced");
        }
        else{
          char d=s.pop();
          if((b==']' && d!='[') ||(b=='}' && d!='{') ||(b==')' && d!='(')){
            System.out.println("Not Balalenced");
            break;
          }
        }
      }
    
    }
        if(s.empty()){
          System.out.println("Balanced");
        }else{
          System.out.println("Not Balanaced");
        }
  }
}

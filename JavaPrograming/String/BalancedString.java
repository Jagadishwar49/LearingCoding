import java.util.Stack;

public class BalancedString {
  public static boolean isBalanced(String a){
    Stack<Character> stk=new Stack<>();
    for (int i=0;i<a.length();i++){
      char b=a.charAt(i);
      if(b=='[' || b=='{' ||b=='('){
        stk.push(a.charAt(i));
      }
      else if(b==']' || b=='}' ||b==')'){
        if(stk.empty()){
          return false;
        }
        char c=stk.pop();
        if ((b == ')' && c != '(') || (b == '}' && c != '{') || (b == ']' && c != '[')      ){
          return false;
        } 
      }
    }
    return true;
  }
  public static void main(String[] args) {
        String expression1 = "((a+b)+(c-d))";
        String expression2 = "(a{[d]}b)";
        String expression3 = "(3+45-({4[3-5+3/4]-9)}}])";

        System.out.println(isBalanced(expression1)); // true
        System.out.println(isBalanced(expression2)); // true
        System.out.println(isBalanced(expression3)); // false
    }
}

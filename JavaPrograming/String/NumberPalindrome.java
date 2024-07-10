import java.util.Arrays;
import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String [] args){
        Scanner b=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a= Integer.parseInt(b.nextLine());
        System.out.println(numberPalendrome(a));
    }

    public static boolean numberPalendrome(int a){
        int reminder=0;
        int reverse=0;
        int orignal=a;
        while(a>0){
            reminder=a%10;
            reverse=(reverse*10)+reminder;
            a=a/10;
        }
        System.out.println("reverse = " + reverse);
        return (orignal==reverse);
    }
}

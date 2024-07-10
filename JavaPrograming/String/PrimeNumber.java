import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= Integer.parseInt(input.nextLine());
        System.out.println(isPrime(a));
    }
    public static boolean isPrime(int a){

        for(int i=2;i<a/2;i++){
            if(i%2==0){
                return(false);
            }
        }
        return(true);
    }
}

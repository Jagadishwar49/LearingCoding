import java.util.Arrays;

public class SecondMaxAndMin {
    public static void main(String [] args){
        int [] a= new int[]{23,34,21,12,89,28};
        System.out.println(secondMaxMin(a));
    }
    public static int secondMaxMin(int[] a){
        int maxNub=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxNub){
                maxNub=a[i];
            }
        }
        System.out.println("1st max  " + maxNub);
        int secondmax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=maxNub && a[i]>secondmax){
                secondmax=a[i];
            }
        }
        System.out.println("2nd max : "+secondmax);
        return secondmax;
    }
}

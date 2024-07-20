import java.util.Arrays;

public class InstertionSort {
    public static void main(String[] args){
        int a[] ={12,3,41,3,45,56,7,45,67};
        System.out.println(instertionSort(a));
    }
    public static String instertionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int pos=i;
            while(pos>0 && a[pos]<a[pos-1]){
                int temp=a[pos];
                a[pos]=a[pos-1];
                a[pos-1]=temp;
                pos--;
            }
        }
        return(Arrays.toString(a));
    }
}

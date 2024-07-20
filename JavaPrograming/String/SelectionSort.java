import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] a={34 ,56,12,34,12,7,83};
        System.out.println(selectionSort(a));
    }
    public static String selectionSort(int []a){
        for(int i=0;i<a.length;i++){
            int minpos=i;
            for(int j=i;j<a.length;j++){
                if(a[j]<a[minpos]){
                    minpos=j;
                }
            }
            int temp=a[minpos];
            a[minpos]=a[i];
            a[i]=temp;
        }
        return(Arrays.toString(a));

    }
}

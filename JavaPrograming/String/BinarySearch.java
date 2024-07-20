public class BinarySearch {
    public static void main(String[] args){
        int [] a={1,2,3,4,5,6};
        int v=9;
        int m=0;
        int n=a.length;
        System.out.println(bSearch(a,v,m,n));
    }
    public static String bSearch(int[] a,int v,int m,int n){
        if(m-n==0){
            return ("Value Is not present");
        }
        int mid=(m+n)/2;
        if(v==a[mid]){
            return("value is present ");
        }
        if(v>a[mid]){
            return (bSearch(a,v,mid+1,n));
        }else{
            return (bSearch(a,v,m,mid));
        }

    }
}

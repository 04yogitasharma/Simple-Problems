import java.util.Arrays;

public class rearrrangeArrayinIncreasingAndDecreasing {
    public static void main(String[] args) {
        int arr[]={22,66,4,89,34,76};
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<=n/2;i++){
            System.out.print(arr[i]+ " ");
        }
        for(int i=n-1;i>n/2;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.Arrays;

public class medianOfTheElement {
    public static void main(String[] args) {
        int arr[]={11,66,44,99,5};
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
            int ind1=(n/2)-1;
            int ind2=(n/2);
            int median=(arr[ind1]+arr[ind2])/2;
            System.out.println(median);
        }
        else{
            System.out.println(arr[n/2]);
        }
    }
}

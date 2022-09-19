public class rotateArrayByKTimes {
    public static void main(String[] args) {
        int arr[]={22,66,44,11,99};
        int k=2;
        int n=arr.length;
        for(int i=k;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

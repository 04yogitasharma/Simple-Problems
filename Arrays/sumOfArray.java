public class sumOfArray {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}

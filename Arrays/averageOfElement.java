public class averageOfElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int avg=sum/n;
        System.out.println(avg);
    }
}

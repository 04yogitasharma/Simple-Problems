public class insertAtDifferentPosition {
    static void insert(int arr[],int pos,int value,int n){
        // int n=arr.length;
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=value;
    }
    public static void main(String[] args) {
        int arr[]={22,44,66,99,100};
        int n=4;
        insert(arr,1,11,n);
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

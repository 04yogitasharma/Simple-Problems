import java.util.Arrays;

public class removeDuplicant_sorted{
    public static void main(String[] args) {
        int arr[]={1,4,1,4,2,1,3,2,2,3,4};
        Arrays.sort(arr);
        int k=removeduplicant(arr);
        System.out.println("The array after removing duplicant:");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int removeduplicant(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
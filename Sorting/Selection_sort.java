package Sorting;

public class Selection_sort {
    static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={3,6,1,5,2};
        selectionSort(arr);
        
    }
}

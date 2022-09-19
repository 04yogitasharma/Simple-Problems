package Sorting;

public class quick_sort {
    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr, low, p);
            quickSort(arr, p+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,3,1,4,9};
        quickSort(arr,0,arr.length-1);
    }
}

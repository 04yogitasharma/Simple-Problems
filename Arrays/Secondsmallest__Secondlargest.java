
public class Secondsmallest__Secondlargest {
    static int Secondlargest(int arr[],int n){
       int largest=Integer.MIN_VALUE;
       int secondLargest=Integer.MIN_VALUE;
       
       if(n<2){
        return -1;
       }
       for(int i=0;i<n;i++){
        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondLargest&&arr[i]!=largest){
            secondLargest=arr[i];
        }
       }
       return secondLargest;
    }

    static int secondSmallest(int arr[],int n){
        if(n<2){
            return -1;
        }
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            } 
            else if(arr[i]<secondsmallest&&arr[i]!=smallest){
                secondsmallest=arr[i];
            }
        }
        return secondsmallest;
    }
    public static void main(String[] args) {
        int[] arr={23,54,7,89,5,122,0,-3};
        int n=arr.length;
        int c=Secondlargest(arr,n);
        System.out.println(c);
        int d=secondSmallest(arr, n);
        System.out.println(d);
            
    }
}

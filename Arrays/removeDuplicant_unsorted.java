import java.util.HashMap;

public class removeDuplicant_unsorted {
    static void duplicate(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!h.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                h.put(arr[i],1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,4,6,2,4,2,6};
        duplicate(arr);
    }
}

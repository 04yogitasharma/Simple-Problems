import java.util.Arrays;

class Smallest_no_in_array{
    static int smallestno(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int arr[]={32,45,2,78,0,-7};
        int c=smallestno(arr);
        System.out.println(c);
    }
}
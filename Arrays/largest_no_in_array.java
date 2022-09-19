import java .util.Arrays;
public class largest_no_in_array {
    public static void main(String[] args) {
        int arr[]={22,55,88,34,12,100};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}

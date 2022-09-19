import java.util.HashMap;
import java.util.Map.Entry;

public class repeating_elements {
    static void findRepeatingElement(int arr[]){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr){
            if(h.get(i)==null){
                h.put(i,1);
            }
            else{
                h.put(i,h.get(i)+1);
            }
        }
        for(Entry<Integer,Integer> entry:h.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,2,5,3,2,5,3};
        findRepeatingElement(arr);
    }
}

import java.util.HashMap;
import java.util.Map.Entry;


public class non_repeating_element {
    static void nonRepeatingElement(int arr[]){
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
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={22,44,22,44,55,55,11,77,5};
        nonRepeatingElement(arr);
    }
}

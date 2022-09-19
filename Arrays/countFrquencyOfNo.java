// import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class countFrquencyOfNo {
    static void countFrequency(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h1.containsKey(arr[i])){
                h1.put(arr[i],h1.get(arr[i])+1);
            }
            else{
                h1.put(arr[i],1);
            }
        }
        for(Entry<Integer, Integer> entry : h1.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]={33,66,33,66,22,33,22,66};
        countFrequency(arr);
    }
}

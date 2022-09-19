package String;

public class reverse_string {
    public static String swap(String str,int i,int j){
        StringBuilder s=new StringBuilder(str);
        s.setCharAt(i, str.charAt(j));
        s.setCharAt(j, str.charAt(i));
        return s.toString();
    }
    public static void main(String[] args) {
        String str="HELLO";
        int i=0;
        int j=str.length()-1;
        while(i<j){
            str=swap(str,i,j);
            i++;
            j--;
        }
        System.out.println(str);
    }
}

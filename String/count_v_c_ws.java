package String;

public class count_v_c_ws {
    static private void count(String s,int n){
        int vowel=0,consonant=0,space=0;
        s=s.toLowerCase();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
            else if(ch>='a'&&ch<='z'){
                consonant++;
            }
            else if(ch==' '){
                space++;
            }
        }
        System.out.println("vowels :"+vowel);
        System.out.println(("consonants :"+consonant));
        System.out.println("white spaces :"+space);
    }
 public static void main(String[] args) {
    String str="My name is Yogita";
    int n=str.length();
    count(str,n);
 }   
}

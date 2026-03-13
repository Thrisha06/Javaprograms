import java.util.Arrays;

public class halfstringreverse {
    public static void main(String[] args){
        String s="Javadeveloper";
        char ch[]=s.toCharArray();
        int l=s.length()/2;
        int r=s.length()-1;
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(ch));
    }
    
}

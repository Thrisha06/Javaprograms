
import java.util.Arrays;

public class twosumarray {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        Arrays.sort(arr);
        int tar=6;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==tar){
                System.out.println(l+" "+r);
                return;
            }else if(sum<tar){
                l++;
            }else{
                r--;
            }

        }
    }
}
    
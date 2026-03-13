
import java.util.*;

public class Binarysearch {
    public static void main(String[] args) {
       
        int arr[] = {2,3,6,8,1,9,5};
        Arrays.sort(arr);
        int tar=1;
        int l=0;
        int r=arr.length;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]==tar){
                System.out.println(arr[mid]);
                return;
            }else if(tar<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(l);
    }
}
    


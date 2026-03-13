import java.util.Arrays;

public class halfreverse {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,6,7};
        int l=arr.length/2;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
    


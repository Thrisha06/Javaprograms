import java.util.Arrays;

public class threepointerarray {
    public static void main(String[] args) {
        int arr[]= {-1,0,1,2,-1,-4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
		int l=i+1;
		int r=arr.length-1;
		
		while(l<r) {
			int sum=arr[i]+arr[l]+arr[r];
			if(sum==0) {
				System.out.println(i+" "+l+" "+r);
				return;
				
			}
			else if(sum<0){
				l++;
			}
			else {
				r--;
			}
		 }
	   }

        
    }
    
}

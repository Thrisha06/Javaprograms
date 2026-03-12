public class zerosnumbers {
	public static void main(String[] args) {
		int arr[] = {9,5,0,1,2,0,10,0,3,0,-1};
		
		int count=0;
		int arr1[] =new int[arr.length];
		
		for(int i=0;i<arr.length;i++) { 
		 if(arr[i]==0){
            count++;
         
         }else{
            arr[i-count]=arr[i];
         }
         System.out.println(arr[i]);
        }
		
	}
}


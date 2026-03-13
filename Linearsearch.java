public class Linearsearch {
    public static void main(String[] args) {
        int arr[]={2,5,4,8,1,7};
        int tar=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
    


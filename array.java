public class array{
    public static void main(String[] args){
       int[] a1={1,1,2,2,3,4};
       for(int i=0;i<a1.length;i++){
        int count=0;
        for(int j=0;j<a1.length;j++){
            if(a1[i]==a1[j]){
                count++;
            }
        }
        if(count==1){
            System.out.println(a1[i]+" ");
        }
       }
    }
}
        

public class perfectnumber {
    public static void main(String[] args) {
        for(int num=1;num<10000;num++){
                int sum=0;
        
            for(int i=1;i<num;i++){
            if(num%i==0){
                // break;
                sum += i;
    
            } 
        }
           if(num==sum){
                System.out.println(num+" ");
            }
        
        }
        
    }
    
}

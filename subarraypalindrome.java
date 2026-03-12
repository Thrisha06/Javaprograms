public class subarraypalinderome{
    public static void main(String[] args){
        String s="malayalam";
        
        for(int i=0;i<s.length;i++){
            for(int j=i+3;j<s.length;j++){
                String s1 = s.substring(i,j);
                System.out.println(s1);
            }
            while(s!=0){
                int rem = s%10;
                s1 = s1*10 + rem;
                s=s/10;
                
            }if(s1==s){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }
    }
}
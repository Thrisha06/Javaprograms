public class fronttwostrings {
    public static void main(String[] args) {
        String str = "Java";
        int take = 2;
        if(take>str.length()){
            take = str.length();
        }
        String front = str.substring(0,take);
        System.out.println(front + str + front);
        
    }
    
}

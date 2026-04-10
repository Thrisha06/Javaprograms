public class validinvalidpassword {
    public static void main(String[] args) {
        String password="Abc^defg1";


        if(password.length()>=8 && password.length()<=20){
            boolean hasupper=false;
            boolean haslower=false;
            boolean hasdigits=false;
            boolean hasspecial=false;
            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);
                if(Character.isUpperCase(ch)){
                    hasupper=true;
            }
        }
        }
        
    }
}

    
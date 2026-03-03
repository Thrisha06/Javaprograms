import java.util.*;

class MitsException extends RuntimeException{
    MitsException(String s){
        System.out.println(s);
    }
}
public class Exception{
    public static void main(String[] args){
       try{
        int c=10/0;
        System.out.println(c);
       }catch(ArithmeticException e) {
		e.printStackTrace();
	}
    }
}
public class reverse{
  public static void main(String[] args){
    int i = 1234;
    int reverse=0;
    while(i!=0){
      int rem = i%10;
      reverse =reverse * 10+rem;
      i/=10;
    }
    System.out.println(reverse);

    }
}


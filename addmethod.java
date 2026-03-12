public class addmethod{
    public static void main(String[] args){
        addmethod m=new addmethod();
        int add=m.add(10,20);
        System.out.println(m.s());
        System.out.println(add);

    }
    int add(int a,int b){
        return a+b;
    }
    String s(){
        return "Thiru Love you";
    }
}
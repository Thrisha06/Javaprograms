public class MyString{
    public static void main(String[] args){
        String s= "Mits";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('0')==-1);
        char ch[] = s.tocharArray();
        System.out.println(ch[0]);
    }
}
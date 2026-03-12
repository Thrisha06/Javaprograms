import java.util.*;
public class panagram{
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] alphabet = new boolean[26];
        int index = 0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                index=ch-'a';
                alphabet[index]=true;
            }
            else if(ch>='A' && ch<='Z'){
                index=ch-'A';
                alphabet[index]=true;
            }

        }
        boolean ispanagram=true;
        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]==false){
                ispanagram=false;
                break;
            }
        }
        if(ispanagram){
            System.out.println("The string is a panagram");
        }else{
            System.out.println("The string is not a panagram");

        }
        }

    }

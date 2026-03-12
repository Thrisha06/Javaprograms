import java.util.*;
public class duplicatearray{
    public static void main(String[] args){
        int a[] = {1,2,1,3,4,2,4};
        Set<Integer> set = new HashSet<>();
        for(int num : a){
            set.add(num);

        }
        System.out.println(set);
    }
}
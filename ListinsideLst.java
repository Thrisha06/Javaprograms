import java.util.LinkedList;
import java.util.List;

public class ListinsideLst {
    public static void main(String[] args){
        List<List<Integer>> ll  = new LinkedList<>();
        
        for(int i = 0; i < 4; i++){
            ll.add(new LinkedList<>());
            for(int j = 0; j < 4; j++){
                ll.get(i).add(0);
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(ll.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    
}
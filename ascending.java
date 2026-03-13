
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ascending {
    public static void main(String[] args) {
        int a[]={5,7,10,4,0,1,6};
        List<Integer>li1=new ArrayList<>();
        List<Integer>li2=new ArrayList<>();
        for(int i=0;i<a.length/2;i++)
            li1.add(a[i]);
        for(int i=a.length/2;i<a.length;i++)
            li2.add(a[i]);

        Collections.sort(li1);
        Collections.reverse(li1);

        Collections.sort(li2);


        int x=0;
        for(int i=0;i<li1.size();i++)
         a[x++]=li1.get(i);
        for(int i=0;i<li2.size();i++)
            a[x++]=li2.get(i);
        

           System.out.println(Arrays.toString(a));
}
        

}  

    


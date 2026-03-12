import java.util.Arrays;

public class secondlargestarray {

    public static int getSecondLargest(int[] a) {
        int n = a.length;

        Arrays.sort(a);

        for(int i = n - 2; i >= 0; i--) {
            if(a[i] != a[n - 1]) {
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {12, 4, 6, 34, 8, 5};

        System.out.println(getSecondLargest(a));
    }
}
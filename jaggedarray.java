public class jaggedarray{
    public static void main(String[] args){

        int a[][] = {{1,2,3},{7,2,6,7},{4,5}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
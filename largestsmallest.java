public class largestsmallest{
    public static void main(String[] args){
        int a[] = {1,2,3,4,56,6,64};
        int largest = a[0];
        int smallest = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] > largest){
                largest = a[i];
            }
            else if(a[i] < smallest){
                smallest = a[i];
            }
        }

        System.out.println("largest number is " + largest);
        System.out.println("smallest number is " + smallest);
    }
}
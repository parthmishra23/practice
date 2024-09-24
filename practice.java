public class practice {
    public static void main(String[] args) {

        int arr[] = {12, 11, 7, 14, 5};
        int max = arr[0];
        for ( int i=0; i<arr.length; i++){
         if( arr[i]> max)
           max = arr[i];
        }
        System.out.println("largest element is "+ max);
        System.out.println((int)(Math.sqrt(max)));
    }
}

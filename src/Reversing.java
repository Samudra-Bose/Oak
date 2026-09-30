public class Reversing {
    public static int[] reverse(int[] arr){
        int[] b = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            b[i] = arr[arr.length -i -1];
        }
        return b;
    }
    public static void main(String[] args){
        int[] arr = {1,34,5,45,45,45,6,23,5};
       int[] a =  reverse(arr);
    }
}

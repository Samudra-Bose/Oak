public class FirstIndex {
    public static void main(String[] arg){
        int target = 4 ;
        int last = -1;
        int[] arr = {3,5,6,7,4,6,2,7,4,63,4};
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] == target ){
                System.out.println(i);
                 break;
            }
            else{
                System.out.println(i);

            }
        }for(int i =0 ; i<arr.length ; i++){
            if(arr[i] == target ){
               last = i ;
            }
        }
    }
}

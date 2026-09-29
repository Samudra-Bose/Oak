public class Occurences {
    public static int[] PositiveNegative(int[] arr) {
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive += arr[i];
            } else if (arr[i] < 0) {
                negative += arr[i];
            }
        }
        return new int[]{positive, negative};
    }
        public static void main(String[] args){
            int[] arr = {5, -3, 7, -2, 0, 4};
            int[] result = PositiveNegative(arr);
            System.out.println("Positive sum = " + result[0]);
            System.out.println("Negative sum = " + result[1]);
        }
}
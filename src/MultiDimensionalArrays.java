import java.util.Random;
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int height = 5;
        Random rand = new Random();
        int[][][] a = new int[rows][cols][height];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for(int k=0 ; k<height ; k++){
                a[i][j][k] = rand.nextInt(100);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for(int k=0; k<height ; k++){
                System.out.print(a[i][j][k] + "\t");
            }
            System.out.println();
        }
    }
    }
}

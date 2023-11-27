//Example of Enhanced for loop
import java.util.Arrays;
public class CalculateMean {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] row : mat) {
            int sum = 0;
            for (int element : row) {
                sum += element;
            }
            int mean = sum / row.length;
            System.out.println("Mean of row " + Arrays.toString(row) + " is: " + mean);
        }
    }
}

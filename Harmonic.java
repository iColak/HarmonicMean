package arrays;
import java.util.Arrays;

public class Harmonic {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double harmonic = 0.0, harmonicMean;
        for (int i : list) {
            harmonic += 1.0 / i;
        }
        harmonicMean = list.length / harmonic;
        System.out.println("Harmonic mean of the array is: " + harmonicMean);
    }
}

import java.util.Arrays;
import java.util.Random;

public class Random4DigitStats {
    public static int[] generate4DigitRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + r.nextInt(9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int v : numbers) { sum += v; if (v < min) min = v; if (v > max) max = v; }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(arr));
        double[] res = findAverageMinMax(arr);
        System.out.println("Average: " + res[0] + ", Min: " + (int)res[1] + ", Max: " + (int)res[2]);
    }
}

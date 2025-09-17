import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    public static int generate6DigitOTP() {
        Random r = new Random();
        return 100000 + r.nextInt(900000);
    }

    public static boolean uniqueOTPs(int[] otps) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int v: otps) s.add(v);
        return s.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0;i<10;i++) arr[i]=generate6DigitOTP();
        System.out.print("OTPs: ");
        for (int v:arr) System.out.print(v + " ");
        System.out.println("\nUnique? " + uniqueOTPs(arr));
    }
}

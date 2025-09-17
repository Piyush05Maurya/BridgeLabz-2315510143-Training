import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(long n) {
        if (n==0) return 1;
        n = Math.abs(n);
        int c=0; while (n>0) { c++; n/=10; } return c;
    }

    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        int len = countDigits(n);
        int[] d = new int[len];
        for (int i = len-1; i >=0; i--) { d[i] = (int)(n % 10); n/=10; }
        return d;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d: digits) if (d==0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int pow = digits.length;
        int sum = 0;
        for (int d: digits) sum += Math.pow(d, pow);
        int original = 0;
        for (int d: digits) { original = original*10 + d; }
        return sum == original;
    }

    public static int[] largestSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d: digits) {
            if (d > max) { second = max; max = d; }
            else if (d > second && d != max) second = d;
        }
        return new int[]{max, second==Integer.MIN_VALUE?max:second};
    }

    public static int[] smallestSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d: digits) {
            if (d < min) { second = min; min = d; }
            else if (d < second && d != min) second = d;
        }
        return new int[]{min, second==Integer.MAX_VALUE?min:second};
    }

    // Additional helpers used in other parts
    public static int sumDigits(int[] digits) { int s=0; for(int d:digits) s+=d; return s; }
    public static int productDigits(int[] digits) { int p=1; for(int d:digits) p*=d; return p; }
    public static int sumSquares(int[] digits) { int s=0; for(int d:digits) s+=d*d; return s; }

    public static boolean isHarshad(int[] digits) {
        int sum = sumDigits(digits);
        int n=0; for (int d:digits) n = n*10 + d;
        if (sum==0) return false;
        return n % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i=0;i<10;i++) { freq[i][0]=i; freq[i][1]=0; }
        for (int d:digits) freq[d][1]++;
        return freq;
    }

    public static int[] reverseArray(int[] arr) {
        int[] r = new int[arr.length];
        for (int i=0;i<arr.length;i++) r[i]=arr[arr.length-1-i];
        return r;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a,b);
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverseArray(digits));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i=5;i*i<=n;i+=6) if (n%i==0 || n%(i+2)==0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n*n; int sum=0; while (sq>0) { sum+=sq%10; sq/=10; } return sum==n;
    }

    public static boolean isSpy(int n) {
        int[] digits = digitsArray(n);
        return sumDigits(digits) == productDigits(digits);
    }

    public static boolean isAutomorphic(int n) {
        long sq = (long)n * n;
        String s = String.valueOf(sq);
        String t = String.valueOf(n);
        return s.endsWith(t);
    }

    public static boolean isBuzz(int n) {
        return n%7==0 || n%10==7;
    }

    public static boolean isPerfect(int n) {
        if (n<=1) return false;
        int s=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                s += i;
                if(i != n/i) s += n/i;
            }
        }
        return s==n;
    }

    public static boolean isAbundant(int n) {
        if (n<=1) return false;
        int s=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                s+=i;
                if(i != n/i) s += n/i;
            }
        }
        return s>n;
    }

    public static boolean isDeficient(int n) {
        if (n<=1) return true;
        int s=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                s+=i;
                if(i != n/i) s += n/i;
            }
        }
        return s<n;
    }

    public static long factorial(int n) {
        long f=1; for(int i=2;i<=n;i++) f*=i; return f;
    }

    public static boolean isStrong(int n) {
        int[] digits = digitsArray(n);
        long s=0; for (int d:digits) s += factorial(d);
        int orig=0; for (int d:digits) orig = orig*10 + d;
        return s == orig;
    }

    public static void main(String[] args) {
        // simple demo printed for a few numbers
        int n = 153;
        int[] digits = digitsArray(n);
        System.out.println("Digits of " + n + ": " + Arrays.toString(digits));
        System.out.println("Is Armstrong? " + isArmstrong(digits));
        System.out.println("Is Perfect(6)? " + isPerfect(6));
        System.out.println("Is Strong(145)? " + isStrong(145));
    }
}

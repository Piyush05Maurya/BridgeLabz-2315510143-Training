import java.util.Arrays;

public class FactorsAdvanced {
    public static int[] factorsOf(int n) {
        if (n <= 0) return new int[0];
        int count=0;
        for (int i=1;i<=n;i++) if (n%i==0) count++;
        int[] f = new int[count]; int idx=0;
        for (int i=1;i<=n;i++) if (n%i==0) f[idx++]=i;
        return f;
    }

    public static int greatestFactor(int[] f) {
        if (f.length==0) return -1;
        return f[f.length-1];
    }

    public static int sum(int[] f){ int s=0; for(int v:f) s+=v; return s; }
    public static long product(int[] f){ long p=1; for(int v:f) p*=v; return p; }
    public static long productOfCubes(int[] f){ long p=1; for(int v:f) p*= (long)Math.pow(v,3); return p; }

    public static void main(String[] args) {
        int n = 28;
        int[] f = factorsOf(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest factor: " + greatestFactor(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Product of cubes: " + productOfCubes(f));
    }
}

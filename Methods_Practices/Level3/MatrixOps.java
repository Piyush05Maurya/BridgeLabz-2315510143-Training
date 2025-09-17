import java.util.Random;
import java.util.Arrays;

public class MatrixOps {
    public static int[][] randomMatrix(int r,int c) {
        Random rnd = new Random();
        int[][] m = new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) m[i][j] = rnd.nextInt(10);
        return m;
    }

    public static int[][] add(int[][] a,int[][] b) {
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a,int[][] b) {
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a,int[][] b) {
        int r=a.length, c=b[0].length, common=a[0].length;
        int[][] res = new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) for (int k=0;k<common;k++) res[i][j]+=a[i][k]*b[k][j];
        return res;
    }

    public static double[][] transpose(int[][] a) {
        int r=a.length,c=a[0].length; double[][] t=new double[c][r];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }

    public static int det2x2(int[][] m) { return m[0][0]*m[1][1] - m[0][1]*m[1][0]; }

    public static int det3x3(int[][] m) {
        int det = m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
        return det;
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = det2x2(m);
        if (det == 0) return new double[0][0];
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] = m[0][0] / (double)det;
        return inv;
    }

    // For 3x3 inverse using adjoint method (limited)
    public static double[][] inverse3x3(int[][] m) {
        int det = det3x3(m);
        if (det == 0) return new double[0][0];
        double[][] adj = new double[3][3];
        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        adj[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        adj[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        adj[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);
        // transpose adj to get cofactor matrix then divide by det
        double[][] inv = new double[3][3];
        for (int i=0;i<3;i++) for (int j=0;j<3;j++) inv[i][j] = adj[j][i] / (double)det;
        return inv;
    }

    public static void printIntMatrix(int[][] m) {
        for (int[] row:m) { for (int v:row) System.out.print(v + "\t"); System.out.println(); }
    }

    public static void printDoubleMatrix(double[][] m) {
        if (m.length==0) { System.out.println("No inverse"); return; }
        for (double[] row:m) { for (double v:row) System.out.printf("%.3f\t", v); System.out.println(); }
    }

    public static void main(String[] args) {
        int[][] a = randomMatrix(2,2);
        int[][] b = randomMatrix(2,2);
        System.out.println("A:"); printIntMatrix(a);
        System.out.println("B:"); printIntMatrix(b);
        System.out.println("A+B:"); printIntMatrix(add(a,b));
        System.out.println("A-B:"); printIntMatrix(subtract(a,b));
        System.out.println("A*B:"); printIntMatrix(multiply(a,b));
        System.out.println("Transpose A:"); printDoubleMatrix(transpose(a));
        System.out.println("Det A: " + det2x2(a));
        System.out.println("Inv A:"); printDoubleMatrix(inverse2x2(a));

        int[][] c = randomMatrix(3,3);
        System.out.println("C:"); printIntMatrix(c);
        System.out.println("Det C: " + det3x3(c));
        System.out.println("Inv C:"); printDoubleMatrix(inverse3x3(c));
    }
}

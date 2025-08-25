import java.util.*;

class MarksGrade {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n],c=new int[n],m=new int[n];
        double[] per=new double[n];
        char[] g=new char[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();c[i]=sc.nextInt();m[i]=sc.nextInt();
            if(p[i]<0||c[i]<0||m[i]<0){i--;continue;}
            per[i]=(p[i]+c[i]+m[i])/3.0;
            if(per[i]>=90)g[i]='A';
            else if(per[i]>=75)g[i]='B';
            else if(per[i]>=50)g[i]='C';
            else g[i]='F';
        }
        for(int i=0;i<n;i++)
            System.out.println(p[i]+" "+c[i]+" "+m[i]+" "+per[i]+" "+g[i]);
    }
}

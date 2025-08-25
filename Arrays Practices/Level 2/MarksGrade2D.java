import java.util.*;

class MarksGrade2D {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mk=new int[n][3];
        double[] per=new double[n];
        char[] g=new char[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                mk[i][j]=sc.nextInt();
                if(mk[i][j]<0){j--;continue;}
            }
            per[i]=(mk[i][0]+mk[i][1]+mk[i][2])/3.0;
            if(per[i]>=90)g[i]='A';
            else if(per[i]>=75)g[i]='B';
            else if(per[i]>=50)g[i]='C';
            else g[i]='F';
        }
        for(int i=0;i<n;i++)
            System.out.println(mk[i][0]+" "+mk[i][1]+" "+mk[i][2]+" "+per[i]+" "+g[i]);
    }
}

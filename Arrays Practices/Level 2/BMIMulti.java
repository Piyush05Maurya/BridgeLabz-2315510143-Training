import java.util.*;

class BMIMulti {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] d=new double[n][3];
        String[] st=new String[n];
        for(int i=0;i<n;i++){
            d[i][0]=sc.nextDouble();
            d[i][1]=sc.nextDouble();
            if(d[i][0]<=0||d[i][1]<=0){i--;continue;}
            d[i][2]=d[i][0]/(d[i][1]*d[i][1]);
            if(d[i][2]<18.5)st[i]="Under";
            else if(d[i][2]<25)st[i]="Normal";
            else if(d[i][2]<30)st[i]="Over";
            else st[i]="Obese";
        }
        for(int i=0;i<n;i++)
            System.out.println(d[i][0]+" "+d[i][1]+" "+d[i][2]+" "+st[i]);
    }
}

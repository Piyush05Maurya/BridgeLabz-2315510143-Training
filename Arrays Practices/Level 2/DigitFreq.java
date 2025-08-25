import java.util.*;

class DigitFreq {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,t=n;
        while(t!=0){c++;t/=10;}
        int[] d=new int[c];
        for(int i=0;i<c;i++){d[i]=n%10;n/=10;}
        int[] f=new int[10];
        for(int i=0;i<c;i++)f[d[i]]++;
        for(int i=0;i<10;i++)if(f[i]>0)
            System.out.println(i+" "+f[i]);
    }
}

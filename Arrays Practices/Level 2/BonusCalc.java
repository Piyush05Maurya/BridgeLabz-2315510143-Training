import java.util.*;

class BonusCalc {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        double[] s=new double[10];
        double[] y=new double[10];
        double[] b=new double[10];
        double[] ns=new double[10];
        double ts=0,tns=0,tb=0;
        for(int i=0;i<10;i++){
            System.out.print("sal: ");
            s[i]=sc.nextDouble();
            System.out.print("yrs: ");
            y[i]=sc.nextDouble();
            if(s[i]<=0||y[i]<0){i--;continue;}
        }
        for(int i=0;i<10;i++){
            if(y[i]>5)b[i]=s[i]*0.05;
            else b[i]=s[i]*0.02;
            ns[i]=s[i]+b[i];
            ts+=s[i]; tns+=ns[i]; tb+=b[i];
        }
        System.out.println("old:"+ts);
        System.out.println("new:"+tns);
        System.out.println("bonus:"+tb);
    }
}

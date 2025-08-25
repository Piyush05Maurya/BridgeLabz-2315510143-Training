import java.util.*;

class LargestDigits {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),md=10,idx=0;
        int[] d=new int[md];
        while(n!=0){
            if(idx==md)break;
            d[idx++]=n%10;
            n/=10;
        }
        int l1=0,l2=0;
        for(int i=0;i<idx;i++){
            if(d[i]>l1){l2=l1;l1=d[i];}
            else if(d[i]>l2&&d[i]!=l1)l2=d[i];
        }
        System.out.println("big:"+l1+" sec:"+l2);
    }
}

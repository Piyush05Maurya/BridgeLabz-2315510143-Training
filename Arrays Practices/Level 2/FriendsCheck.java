import java.util.*;

class FriendsCheck {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        String[] n={"Amar","Akbar","Anthony"};
        int[] ag=new int[3];
        int[] h=new int[3];
        for(int i=0;i<3;i++){
            System.out.print(n[i]+" age: ");
            ag[i]=sc.nextInt();
            System.out.print(n[i]+" ht: ");
            h[i]=sc.nextInt();
        }
        int ya=0,th=0;
        for(int i=1;i<3;i++){
            if(ag[i]<ag[ya])ya=i;
            if(h[i]>h[th])th=i;
        }
        System.out.println("young: "+n[ya]);
        System.out.println("tall: "+n[th]);
    }
}

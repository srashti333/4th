import java.util.Scanner;

public class q_tralling0 {
    static int tt(int n)
    {
        int c=0;
        for(int i=5;n/i>=1;i*=5)
        {
            c+=n/i;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(tt(n));


    }


}

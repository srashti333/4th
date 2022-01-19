import java.util.Scanner;

public class q_tralling0 {
    static int tt(int n)
    {
        if (n<0)
            return -1;
        int c=0;
        for(int i=5;n/i>=1;i*=5)
        {
            c+=n/i;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(tt(n));


    }


}

public class ABRecursion  {

    public static int fact(int n, int sum)
    {if(n ==1){
            //return 1;
            return sum;
        }
        return fact(n-1,sum*n);
    }   public static void main(String args[]) {
        int n = 3;
        System.out.println(fact(n,1));
    }
}
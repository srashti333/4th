import java.util.Scanner;

public class arri {
    int arr[]; //instance variable
    public arri() {
        arr = new int[5];
        Scanner S = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
    }
    public static void main(String[] args) {
        arri obj =new arri();
        for(int res:obj.arr){               //traversal operation
            System.out.println(res);
        }
    }
}

import java.util.Arrays;

/* write a program to create array of size 5 and assign Minimum integer value in array
(a)print array
(b)search a value in the given array
(c)delete a value from array
(d)delete whole array*/
public class Array1 {
    int arr[]=null;
    public Array1()
    {
        arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }
    //to inset or modify value at given index in an array
    public void insert(int v,int n)
    {
        if(arr[n]==Integer.MIN_VALUE)
        {
            arr[n]=v;
        }
        else
        {
            System.out.println("already filled");
        }
    }
    //traversing array
    public void printArr()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    //print specific index value
    public void printArrI(int n)
    {
        System.out.println(arr[n]);
    }
    //to search a value in the given array
    public void search(int a)
    {
        int r=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                r=1;
                System.out.println("value found");
                return;
            }
        }
        if(r!=1)
        {
            System.out.println("no match found");
        }
    }
    //method to delete a value from array
    public void delete(int n)
    {
        arr[n]=Integer.MIN_VALUE;
    }
    //delete array
    public void delArr()
    {
        arr=null;
    }

    //main
    public static void main(String[] args)
    {
        Array1 obj=new Array1();
        obj.printArr();
        obj.insert(35,0);
        obj.printArr();
        obj.printArrI(0);
        obj.search(35);
        obj.insert(56,1);
        obj.delete(35);
        obj.printArr();
        obj.delArr();
    }
}

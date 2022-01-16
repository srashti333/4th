import java.util.Scanner;

public class q1
{
        int rollno;
        String name;
        int marks;
        public q1(int rollno,String name, int marks)
        {
            this.name = name;
            this.marks = marks;
            this.rollno= rollno;
        }
    public static void main(String[] args)

    {

        // creating an array that will hold 5 student objects
        q1 arr[] = new q1[10];

        // initializing the array with Student object
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i]= new q1(s.nextInt(),s.next(),s.nextInt()); // object creation
        }

        // traverse/print all the objects value stored in array
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.println(arr[i].rollno + "\t" + arr[i].name+ "\t"+ arr[i].marks);
        }

    }
}


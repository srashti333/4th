/*Create an array of 10 students and print the record of those students who got the highest marks and who got minimum marks. The structure of student class is as follows
class Student
{
    private int rollno;
    private int marks
    private String name;
}
 create constructor or getter and setter methods as per need*/
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
        q1 arr[] = new q1[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i]= new q1(s.nextInt(),s.next(),s.nextInt());
        }


        for (int i = 0; i <arr.length ; i++)
        {
            System.out.println(arr[i].rollno + "\t" + arr[i].name+ "\t"+ arr[i].marks);
        }

    }
}


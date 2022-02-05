import java.util.Scanner;

/*Q. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects.
 Now write a program to
(a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.  
(c) find  the number of students who have scored below 50 in their average.  
(d) display the scores obtained by every student.
 */
class Array02
{
    int arr[][];
    Array02()
    {
        Scanner s=new Scanner(System.in);
       arr=new int[4][5];
       for(int i=0;i<4;i++)
       {
           for(int j=0;j<5;j++)
           {
               arr[i][j]=s.nextInt();
           }
       }
    }
    public void AvgSub()
    {
        for(int i=0;i<5;i++)
        {
            float asub=0;
            for(int j=0;j<4;j++)
            {
                asub=asub+arr[j][i];
            }
            System.out.println("avg marks of sub "+(i+1)+" is "+(asub/4));
        }
    }
    public void AvgStu()
    {
        for(int i=0;i<4;i++)
        {
            float astu=0;
            for(int j=0;j<5;j++)
            {
                astu=astu+arr[i][j];
            }
            System.out.println("avg marks of student "+(i+1)+" is "+(astu/5));
        }
    }
    public void below50()
    {
        int c = 0;
        for(int i=0;i<4;i++)
        {
            float astu = 0;
            for (int j = 0; j < 5; j++) {
                astu = astu + arr[i][j];
            }
            if ((astu / 5) < 50) {
                c++;
            }
        }
        System.out.println("no. of student whose average is below 50 are "+ c);
    }
    public void display()
    {
        for(int i=0;i<4;i++)
        {
            System.out.print("the scores obtained by student. "  + (i+1) + " is " );
            for(int j=0;j<5;j++)
            {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Array2 {
    public static void main(String[] args) {
        Array02 obj=new Array02();
        obj.AvgStu();
        obj.AvgSub();
        obj.below50();
        obj.display();
    }
}

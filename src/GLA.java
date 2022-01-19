import java.util.Arrays;
import java.util.Scanner;

class TimeInterval
{
    int start;
    int end;
    public TimeInterval(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public static boolean canAttendMeeting(TimeInterval[] arr)
    {
        int start[] =new int[arr.length];
        int end[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            start[i]=arr[i].start;
            end[i]=arr[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=0;i<start.length-1;i++) {
            if (start[i + 1] >= end[i]) {
                return true;
            }
        }
            return false;
    }
}
public class GLA
{
    public static void main(String[] args)
    {
        //primitive type array
        //int arr[]=new int[5];
        //arr[0]=10;


        //create a non primitive type array

        TimeInterval arr[]=new TimeInterval[5];                          //it'll hold the space to store 5 obj

        //TimeInterval obj1 =new TimeInterval(1,2);
        //arr[0] =obj1;


        Scanner s=new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            arr[i] =new TimeInterval(s.nextInt(),s.nextInt());            //syntax to create the obj;
        }
        System.out.println(TimeInterval.canAttendMeeting(arr));
    }
}

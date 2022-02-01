import java.util.Arrays;
import java.util.Scanner;

class TimeInterval
{
    int start;
    int end;
    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public static boolean canAttendMeeting(TimeInterval[] arr)
    {
        int start[] = new int[arr.length];
        int end[] = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            start[i] = arr[i].start;
            end[i]= arr[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for (int i = 0; i <start.length-1 ; i++) {
            if (start[i + 1] <= end[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // create a non primitive type array
        TimeInterval arr[] = new TimeInterval[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = new TimeInterval(s.nextInt(),s.nextInt());
        }
        boolean res = TimeInterval.canAttendMeeting(arr);
        if(res== false)
        {
            System.out.println("clashes are there");
        }
        else
        {
            System.out.println("no clashes are there");
        }
    }

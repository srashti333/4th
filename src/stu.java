import java.util.Scanner;

class Stu {
    private int rollno;
    private String name;

    public Stu(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // int arr[] = new int[10];
        Stu arr[] = new Stu[5];
        arr[0] = new Stu(1, "srashti");
        System.out.println(arr[0].getRollno() + "\t" + arr[0].getName());

        Stu obj1 = new Stu(2, "naina");
        arr[0] = obj1;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Stu(s.nextInt(), s.next());
        }


    }
}

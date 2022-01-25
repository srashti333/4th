public class immutable {
    public static void main(String[] args) {
        //String in java are immutable
        //not change value
     String s="srashti";
     int i=3;
     //String str1 = new String("abc");
       // System.out.println(s.length());
        //System.out.println(str1.length());
    String res = s.substring(0,i)+ s.substring(i+1);
        System.out.println(res);
    }
}

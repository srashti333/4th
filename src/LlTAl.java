import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LlTAl {
    public static <T> List<T> convertALtoLL(List<T> aL)
        {

            List<T> lL = new LinkedList<>();
            for (T t : aL) {
                lL.add(t);
            }
            return lL;
        }

        public static void main(String args[])
        {
            List<String> aL = Arrays.asList("Geeks",
                    "forGeeks",
                    "A computer Portal");
            System.out.println("ArrayList: " + aL);
            List<String>
                    lL = convertALtoLL(aL);
            System.out.println("LinkedList: " + lL);
        }
    }


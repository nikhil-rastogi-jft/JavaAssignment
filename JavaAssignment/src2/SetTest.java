import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Object> hs=new HashSet<Object>();
        hs.add("Nikhil");
        hs.add("Shubham");
        hs.add("Aman");
        hs.add("Rajkumar");
        System.out.println(hs);
        TreeSet<Object> ts=new TreeSet<Object>(hs);
        System.out.println(ts);
    }
}

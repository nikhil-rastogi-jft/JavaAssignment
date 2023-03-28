import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Objects;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Object> al=new ArrayList<Object>();
        al.add("Nikhil");
        al.add("Shubham");
        al.add("Shivam");
        al.add("Sumit");
        System.out.println(al);
        al.add(2,"Neeraj");
        al.add(1,"Shivansh");
        System.out.println(al);
        al.remove(al.indexOf("Nikhil"));
        System.out.println(al);

    }
}

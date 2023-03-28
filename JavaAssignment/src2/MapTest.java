import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> hm=new HashMap<Object,Object>();
        hm.put("INDIA","NEW DELHI");
        hm.put("UK","LONDON");
        hm.put("FRANCE","PARIS");
        hm.put("USA","NEW YORK");
        hm.put("AUSTRALIA","CANBERRA");
        System.out.println(hm);
        TreeMap<Object,Object> tm=new TreeMap<Object,Object>(hm);
        System.out.println(tm);
    }
}

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class StudentTreeset {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet=new TreeSet<Student>();
        Student a=new Student("nikhil","mca",22);
        Student b=new Student("shubham","B.tech",23);
        Student c=new Student("aman","bca",22);
        Student d=new Student("nikhil","mca",22);
        Student e=new Student("aman","mca",22);
        studentTreeSet.add(a);
        studentTreeSet.add(b);
        studentTreeSet.add(c);
        studentTreeSet.add(e);
        System.out.println(studentTreeSet);
        for(Student s:studentTreeSet)
            s.display();
        System.out.println(studentTreeSet.contains(a));
        System.out.println(studentTreeSet.contains(d));
    }
    }

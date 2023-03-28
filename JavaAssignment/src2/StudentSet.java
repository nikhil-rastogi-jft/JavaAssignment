import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class StudentSet {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student("nikhil", "mca", 22));
        studentSet.add(new Student("nikhil", "mca", 22));
        studentSet.add(new Student("mohit", "mca", 23));
        studentSet.add(new Student("rishabh", "bca", 24));
        for (Student s : studentSet)
            s.display();
    }
}

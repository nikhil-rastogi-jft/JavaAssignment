import java.util.ArrayList;
import java.util.Objects;

public class StudentList {

    public static void main(String[] args) {
        ArrayList<Student> studentlist=new ArrayList<Student>();
        studentlist.add(new Student("Nikhil","MCA",22));
        studentlist.add(new Student("Shubham","B.tech",22));
        System.out.println(studentlist);
        Boolean b=false;
        for(Student s:studentlist)
            s.display();
    }

}

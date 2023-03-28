import java.util.Objects;

public class Student implements Comparable<Student>{
     int age;
     String name,course;
    Student(String name,String course,int age){
        this.age=age;
        this.name=name;
        this.course=course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public void display(){
        System.out.println("Name is :"+this.name);
        System.out.println("Course is:"+this.course);
        System.out.println("age is :"+this.age);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, course);
    }

    @Override
    public int compareTo(Student s) {
       if(name.compareTo(s.name)==0)
           return course.compareTo(s.course);
      return name.compareTo(s.name);
    }

}

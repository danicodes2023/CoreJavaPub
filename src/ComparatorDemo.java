import java.util.*;

public class ComparatorDemo {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 32));
        students.add(new Student("Nina", 22));
        Comparator<Student> comStudent = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return (o1.age > o2.age)? 1:-1;
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        /*students.sort(comStudent); // Using List.sort Java 8 */

        Collections.sort(students, comStudent);
        Collections.sort(students,(o1, o2) -> o1.age > o2.age ? 1:-1 );
        for(Student student : students){
            System.out.println(student);
        }

    }
}

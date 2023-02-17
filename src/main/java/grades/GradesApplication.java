package grades;

import java.util.HashMap;
import java.util.Set;

public class GradesApplication {

        static Student kenzi = new Student("Kenzi");

    public static void main(String[] args) {
        System.out.println(kenzi.getName());

        HashMap<String, Student> students = new HashMap<>();
//        students.put("Kenzi", kenzi);
        System.out.println(students);

        students.put("bob", new Student("Bob"));
        students.put("sue", new Student("Sue"));
        students.put("ragnar", new Student("Ragnar"));
        Set<String> keys = students.keySet();

        for (String key : keys) {
            Student aStudent = students.get(key);
            System.out.println(aStudent.getName());
        }


    }
}

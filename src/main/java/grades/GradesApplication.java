package grades;

import java.util.HashMap;
import java.util.Set;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student jeremy = new Student("Jeremy");
        jeremy.addGrade(78);
        jeremy.addGrade(98);
        jeremy.addGrade(65);

        Student kenzi = new Student("Kenzi");
        kenzi.addGrade(100);
        kenzi.addGrade(100);
        kenzi.addGrade(97);

        Student olivia = new Student("Olivia");
        olivia.addGrade(98);
        olivia.addGrade(95);
        olivia.addGrade(97);

        Student elliot = new Student("Elliot");
        elliot.addGrade(76);
        elliot.addGrade(95);
        elliot.addGrade(79);

        students.put("jeremy", jeremy);
        students.put("kenzi", kenzi);
        students.put("olivia", olivia);
        students.put("elliot", elliot);

        System.out.println(students);
        System.out.println();
        Set<String> keys = students.keySet();

        for (String key : keys) {
            Student aStudent = students.get(key);
            System.out.printf("""
                    Student: %s
                    Grades:  %s
                    Average: %s
                    
                    """, aStudent.getName(), aStudent.grades, aStudent.getGradeAverage());
        }


    }
}

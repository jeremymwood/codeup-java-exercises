package grades;

import static grades.Student.getGradeAverage;

public class TestStudent {
    static Student jeremy = new Student("Jeremy", 0);

    public static void main(String[] args) {

        jeremy.addGrade(100);
        jeremy.addGrade(95);
        jeremy.addGrade(85);
        jeremy.addGrade(75);

        System.out.printf("""
                Student: %s
                Avg:     %s
                """, jeremy.getName(), getGradeAverage());
    }
}

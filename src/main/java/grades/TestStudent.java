package grades;

public class TestStudent {


    public static void main(String[] args) {
        Student jeremy = new Student("Jeremy");
        jeremy.addGrade(100);
        jeremy.addGrade(95);
        jeremy.addGrade(89);
        jeremy.addGrade(75);

        System.out.println(jeremy);
        System.out.println(jeremy.getName());

//        System.out.printf("""
//                Student: %s
//                Avg:     %s
//                """, jeremy.getName(), getGradeAverage());
    }
}

package grades;

import util.Input;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class GradesApplication {

    private static Input input = new Input();

//    private static Student[] students;

    private static HashMap<String, Student> students;


    public static void main(String[] args) {
        Input input = new Input();

        students = new HashMap<>();

        Student jeremy = new Student("Jeremy");
        jeremy.grades.addAll(Arrays.asList(78, 98, 65));

        Student kenzi = new Student("Kenzi");
        kenzi.grades.addAll(Arrays.asList(100, 100, 97));

        Student olivia = new Student("Olivia");
        olivia.grades.addAll(Arrays.asList(98, 95, 97));

        Student elliot = new Student("Elliot");
        elliot.grades.addAll(Arrays.asList(76, 95, 79));


        students.put("jeremy", jeremy);
        students.put("kenzi", kenzi);
        students.put("olivia", olivia);
        students.put("elliot", elliot);
//        System.out.println(students);

        Set<String> keys = students.keySet();

        for (String key : keys) {
            Student aStudent = students.get(key);
            System.out.printf("""
                    Student: %s
                    Grades:  %s
                    Average: %s

                    """, aStudent.getName(), aStudent.grades, aStudent.getGradeAverage());
        }

        while(true) {
            printMenu();
            int choice = input.getInt(0, 4, "Enter your choice: ");
            doChoice(choice);
            if(choice == 0) {
                break;
            }
        }

        System.out.println("Bye");

    }


    private static void printMenu() {
        System.out.println("""
                Welcome!

                Here are the GitHub usernames of our students:

                | Jeremy |   | Kenzi |   | Olivia |   | Elliot |

                What would you like to do?

                0: Exit
                1: Print student info
                2: View all the grades
                3: Overall class average
                4: Print CSV report

                Enter your choice:
                """);
    }

    private static void doChoice(int choice) {
        switch (choice) {
            case 1:
                viewAllStudents();
            case 2:
//                viewAllGrades();
            case 3:
//                overallClassAverage();
            case 4:
//                printCsvReport();
                break;
        }
    }

    private static void viewAllStudents() {
//        ArrayList<String> hashArr = Arrays.asList(students);
        //        ArrayList<String> foods = new ArrayList<>();

        ;

//        for (String student : students.keySet()) {
//
////            Student aStudent = students.get(key);
//            System.out.printf("""
//                    Student: %s
//                    Grades:  %s
//                    Average: %s
//
//                    """, student.getName, student.grades, student.getGradeAverage());
//        }

//        for (Student student : students) {
//            System.out.println(student);
//        }
//        System.out.println(students.get(students));
    }

//    private static void viewStudentsByName(String string) {
//        for (Student student : students) {
//            if (student.getName().equals(student)) {
//                System.out.println(student);
//            }
//        }
//        System.out.println();
//    }
}

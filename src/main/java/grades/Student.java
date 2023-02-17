package grades;

import java.util.ArrayList;

public class Student {

//    ***properties***
    static String name;
    private static ArrayList<Integer> grades;

//    ***methods***
    public Student(String name, int grade) {
        this.name = name;
        grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName() {
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    };
    // returns the average of the students grades
    public static double getGradeAverage() {
        int gradeSum = 0;
        for (int grade : grades) {
            gradeSum += grade;
        }
        return gradeSum / grades.size();
    };

//    public static double getAllGrades(Student) {
//        System.out.println("Grades:");
//        for (int grade : grades) {
//            System.out.println(grade);
//        }
//        return ;
//    };



//    public static void main(String[] args) {

        
//        HashMap<String, Student> studentRoster = new HashMap<>();

//        for (Integer grade : grades) {
//        for (Integer grade : grades) {
//            Student aStudent = studentRoster.get(grade);
//            System.out.println(aStudent);
//        }




//    }

}
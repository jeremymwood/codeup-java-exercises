package grades;

import java.util.ArrayList;

public class Student {

//    ***properties***
    public String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    public ArrayList<Integer> grades;

//    ***methods***
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
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
    public double getGradeAverage() {
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

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
    public String getName() {
        return name;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        int gradeSum = 0;
        for (int grade : grades) {
            gradeSum += grade;
        }
        return gradeSum / grades.size();
    }


}

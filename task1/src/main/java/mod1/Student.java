package mod1;

import java.util.ArrayList;
import java.util.List;

class Student {

    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(
        String name,
        String group,
        int course,
        List<Integer> grades
    ) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<Integer>(grades);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

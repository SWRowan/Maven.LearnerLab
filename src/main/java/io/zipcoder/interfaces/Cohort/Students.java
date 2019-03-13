package io.zipcoder.interfaces.Cohort;

import java.util.ArrayList;

public class Students extends People<Student> {
    private static final Students Instance = new Students();

    public static Students getInstance(){
        return Instance;
    }

    private Students() {
        for (int i = 0; i < 40; i++) {
            Student student = new Student((long)i, null);
            add(student);
        }
    }

    public Student[] getArray() {
        return getPersonList().toArray(new Student[0]);
    }

    public double getTotalHours(){
        double total = 0.0;
        for (Student s : getPersonList()){
            total += s.getTotalStudyTime();
        }
        return total;
    }
}

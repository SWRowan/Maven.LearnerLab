package io.zipcoder.interfaces.Cohort;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public enum Educator implements Teacher {
    LEON("Leon",1),
    FROILAN("Froilan", 2),
    WIL("Wil", 3),
    KRIS("Kris", 4),
    MELANIE("Melanie", 5),
    NHU("Nhu", 6),
    DOLIO("Dolio", 7);

    double timeWorked = 0.0;
    final Instructor instructor;

    Educator(String name, long id) {
        instructor = new Instructor(id);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);
    }

   final static void addAll(){
        for (Educator e : Educator.values()){
            Educator educator = e;
        }

    }

    public void teach(Learner learner, double hours) {
        instructor.teach(learner, hours);
        timeWorked += hours;

    }

    public void lecture(Learner[] learners, double hours) {
        instructor.lecture(learners, hours);
        timeWorked += hours;
    }
}

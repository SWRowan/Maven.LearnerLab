package io.zipcoder.interfaces.Cohort;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public class Instructor extends Person implements Teacher {


    public void teach(Learner learner, double hours) {
        learner.learn(hours);
    }

    public void lecture(Learner[] learners, double hours) {
        for(Learner s : learners){
            s.learn(hours/learners.length);
        }
    }
}

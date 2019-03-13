package io.zipcoder.interfaces.Cohort;

import io.zipcoder.interfaces.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime = 0;

    public Student(){
        super();
    }

    public Student(long id, String name){
        super(id, name);
    }


    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }


}

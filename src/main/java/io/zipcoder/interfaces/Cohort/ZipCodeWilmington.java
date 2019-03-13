package io.zipcoder.interfaces.Cohort;


import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public class ZipCodeWilmington {
    private static ZipCodeWilmington Instance = new ZipCodeWilmington();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance(){
        return Instance;
    }

    public void hostLecture(Instructor educator, double numberOfHours){
        educator.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        hostLecture(instructors.findById(id), numberOfHours);
    }

}

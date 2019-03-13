package io.zipcoder.interfaces.Cohort;

public class Instructors extends People<Instructor> {
    private static Instructors Instance = new Instructors();

    public static Instructors getInstance(){
        return Instance;
    }

    private Instructors(){
    }

    public Instructor[] getArray() {
        return getPersonList().toArray(new Instructor[0]);
    }
}

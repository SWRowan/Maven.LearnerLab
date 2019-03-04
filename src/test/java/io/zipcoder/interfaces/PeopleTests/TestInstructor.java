package io.zipcoder.interfaces.PeopleTests;

import io.zipcoder.interfaces.Cohort.Instructor;
import io.zipcoder.interfaces.Cohort.Person;
import io.zipcoder.interfaces.Cohort.Student;
import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor();
        //When
        boolean actual = instructor instanceof Teacher;
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor();
        //When
        boolean actual = instructor instanceof Person;
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor();
        Student student = new Student();
        double expected = 1.0;
        //When
        instructor.teach(student, 1.0);
        double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor();
        Student s1 = new Student();
        Student s2 = new Student();
        Student[] cohort = {s1, s2};
        double expected = 1.0;
        //When
        instructor.lecture(cohort, 2.0);
        double actual = s1.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, .01);
    }


}

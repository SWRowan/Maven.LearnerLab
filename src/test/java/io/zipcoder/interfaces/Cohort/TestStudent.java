package io.zipcoder.interfaces.Cohort;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Cohort.Person;
import io.zipcoder.interfaces.Cohort.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //Given
        Student person = new Student();
        //When
        boolean actual = person instanceof Learner;
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        //Given
        Student person = new Student();
        //when
        boolean actual = person instanceof Person;
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testLearn(){
        //Given
        double expected = 10.0;
        Student person = new Student();
        //When
        person.learn(10.0);
        double actual = person.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, .01);
    }


}

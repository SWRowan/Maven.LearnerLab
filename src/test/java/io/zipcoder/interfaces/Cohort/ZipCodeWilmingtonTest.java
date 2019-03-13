package io.zipcoder.interfaces.Cohort;

import io.zipcoder.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture(){
        //Given
        Educator.addAll();
        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Integer hours = 10;
        double expected =10;
        //When
        cohort.hostLecture(4, hours);
        double actual = students.getTotalHours();
        //Then
        Assert.assertEquals(expected, actual, 100);

    }

}
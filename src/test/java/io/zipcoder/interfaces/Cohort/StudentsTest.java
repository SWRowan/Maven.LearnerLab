package io.zipcoder.interfaces.Cohort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testSingleton(){
        //Given
        Students cohort = Students.getInstance();
        Integer expected = 40;
        //When
        Integer actual = cohort.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
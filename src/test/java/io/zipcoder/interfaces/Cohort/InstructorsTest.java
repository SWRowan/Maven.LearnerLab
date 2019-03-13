package io.zipcoder.interfaces.Cohort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void testConstructor(){
        //Given
        Instructors instructors = Instructors.getInstance();
        Integer expected = 7;
        //When
        Integer actual = instructors.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindByID(){
        Instructors instructors = Instructors.getInstance();
        Educator educator = Educator.LEON;

        Instructor actual = instructors.findById(1);

        Assert.assertTrue(actual instanceof Instructor);


    }

}
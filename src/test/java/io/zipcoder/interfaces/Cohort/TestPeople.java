package io.zipcoder.interfaces.Cohort;

import io.zipcoder.interfaces.Cohort.People;
import io.zipcoder.interfaces.Cohort.Person;
import io.zipcoder.interfaces.Cohort.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPeople {

    Students students = Students.getInstance();

    @Test
    public void testAdd(){
        //Given
        Integer expected = 41;
        Student student = new Student();
        //When
        students.add(student);
        Integer actual = students.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        //Given
        Integer expected = 39;
        //When
        students.removeById(1L);
        Integer actual = students.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById(){
        //Given

        String expected = "Sean";
        Student student = new Student(12345L, expected);
        students.add(student);
        //When
        String actual = students.findById(12345L).getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindInstructor(){
        Instructors instructors = Instructors.getInstance();
        Instructor e = instructors.findById(1L);
        Assert.assertTrue(e instanceof Instructor);
    }

    @Test
    public void testRemoveAll(){
        Integer expected = 0;
        //When
        students.removeAll();
        Integer actual = students.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToArray(){
        //Given
        Integer expected = 40;
        //When
        Person[] pArr = students.getArray();
        Integer actual = pArr.length;
        //then
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetIDNull(){
        //When
        Person actual = students.findById(123545L);
        //Then
        Assert.assertNull(actual);
    }

}

package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Cohort.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void testConstructor(){
        //Given
        long expectedId = 12345;
        Person person = new Person(expectedId);
        //When
        long actualId = person.getId();
        //Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testSetName(){
        //Given
        String name = "Sean";
        Person person = new Person(12345);
        person.setName(name);
        //When
        String actual = person.getName();
        //Then
        Assert.assertEquals(name, actual);
    }


}

package io.zipcoder.interfaces.Cohort;

public class Person {

    private final long id;
    private String name;


    public Person() {
        id = 0;
        name = "";
    }
    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public Person(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

}

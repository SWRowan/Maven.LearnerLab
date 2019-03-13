package io.zipcoder.interfaces.Cohort;

import io.zipcoder.interfaces.Learner;

import java.util.ArrayList;
import java.util.List;


public abstract class People<E extends Person> {

    private List<E> personList;

    public People() {
        personList = new ArrayList<E>();
    }

    public Integer getCount() {
        return personList.size();
    }

    public void removeById(Long id) {
        removePerson(findById(id));
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void removePerson(E person) {
        personList.remove(person);
    }

    public List<E> getPersonList(){
        return personList;
    }

    public abstract E[] getArray();

    public void removeAll() {
        personList.clear();
    }


}

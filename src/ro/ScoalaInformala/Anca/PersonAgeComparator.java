package ro.ScoalaInformala.Anca;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

    // if ages are equal, compare by name too
    @Override
    public int compare(Person person1, Person person2) {
        int result = Integer.compare(person1.getAge(), person2.getAge());

        if (result == 0) {
            result = person1.getName().compareTo(person2.getName());
        }
        return result;
    }
}

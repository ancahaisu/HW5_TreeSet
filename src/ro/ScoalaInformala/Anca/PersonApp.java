package ro.ScoalaInformala.Anca;

import java.util.*;

public class PersonApp {
    public void run() {
        Person p1 = new Person("Anca", 30);
        Person p2 = new Person("Radu", 25);
        Person p3 = new Person("Delia", 35);
        Person p4 = new Person("Cristian", 30);
        Person p5 = new Person("Razvan", 26);

        Address address1 = new Address("Z.Lombkos", 3, "Timisoara");
        Address address2 = new Address("Strada Mihai Eminescu", 10, "Bucuresti");
        Address address3 = new Address("Strada Libertatii", 5, "Cluj-Napoca");
        Address address4 = new Address("Strada Victoriei", 7, "Iasi");
        Address address5 = new Address("Strada Unirii", 2, "Constanta");

        Hobby swimmingHobby = new Hobby(HobbyType.SWIMMING, 3, Arrays.asList(address1, address2));
        Hobby readingHobby = new Hobby(HobbyType.READING, 5, Arrays.asList(address3, address5));
        Hobby hikingHobby = new Hobby(HobbyType.HIKING, 2, Arrays.asList(address4, address1));
        Hobby paintingHobby = new Hobby(HobbyType.PAINTING, 4, Arrays.asList(address2, address3));
        Hobby dansingHobby = new Hobby(HobbyType.DANCING, 6, Arrays.asList(address5, address4, address1, address3));

        //TREE SET
        //first TreeSet that is sorted by age
        System.out.println("Sorting the TreeSet by age: ");
        TreeSet<Person> personTreeSet = new TreeSet<>(new PersonAgeComparator());
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);
        personTreeSet.add(p5);

        for (Person person : personTreeSet) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
        System.out.println("=====================================");
        //second TreeSet that is sorted by name
        System.out.println("Sorting the TreeSet by name: ");
        TreeSet<Person> personTreeSet2 = new TreeSet<>(new PersonNameComparator());
        personTreeSet2.add(p1);
        personTreeSet2.add(p2);
        personTreeSet2.add(p3);
        personTreeSet2.add(p4);
        personTreeSet2.add(p5);

        for (Person person : personTreeSet2) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

        System.out.println("=====================================");

        //MAP

        Map<Person, List<Hobby>> personHobbiesMap = new HashMap<>();
        personHobbiesMap.put(p1, Arrays.asList(hikingHobby, swimmingHobby));
        personHobbiesMap.put(p2, Arrays.asList(readingHobby, paintingHobby));
        personHobbiesMap.put(p3, Arrays.asList(dansingHobby, hikingHobby));
        personHobbiesMap.put(p4, Arrays.asList(swimmingHobby, readingHobby));
        personHobbiesMap.put(p5, Arrays.asList(paintingHobby, dansingHobby));

        System.out.println("List of persons and their hobbies: ");
        // for person p1 = Anca
        System.out.println("Person => " + p1.getName());

        for (Hobby hobby : personHobbiesMap.get(p1)) {

            System.out.println("Hobby: " + hobby.getHobbyType());

            System.out.println("Cities:");

            for (Address address : hobby.getAddressList()) {
                System.out.println("  " + address.getCity());
            }
        }
        System.out.println("===========new person==================");

        // for person p2 = Radu
        System.out.println("Person => " + p2.getName());

        for (Hobby hobby : personHobbiesMap.get(p2)) {

            System.out.println("Hobby: " + hobby.getHobbyType());

            System.out.println("Cities:");

            for (Address address : hobby.getAddressList()) {
                System.out.println("  " + address.getCity());
            }
        }
    }
}

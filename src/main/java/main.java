import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //SerializePerson serializePerson = new SerializePerson();
        //serializePerson.serializeListOfPerson(createListOfPerson());

        DeserializePerson deserializePerson = new DeserializePerson();
        List<Person> people = deserializePerson.deserializePerson("PeopleSerialization.txt");
        System.out.println(people);
    }

    private static List<Person> createListOfPerson(){
        Person person1 = new Person("Egor", 20);
        Person person2 = new Person("Dima", 15);
        Person person3 = new Person("Andrey", 28);
        Person person4 = new Person("Pavel", 2);
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        return people;
    }
}

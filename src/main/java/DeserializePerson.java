import java.io.*;
import java.util.List;

public class DeserializePerson {

    public List<Person> deserializePerson(String pathToFile){

        try(FileInputStream fis = new FileInputStream(pathToFile);
            ObjectInputStream ois =new ObjectInputStream(fis)){

            List<Person> people = (List<Person>) ois.readObject();
            for (Person person: people){
                person.setOccupation();
            }

            return people;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

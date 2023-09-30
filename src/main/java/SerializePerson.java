
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializePerson {

    public void serializeListOfPerson(List<Person> people){
        try(FileOutputStream fileOutputStream = new FileOutputStream("PeopleSerialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream)){

            oos.writeObject(people);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

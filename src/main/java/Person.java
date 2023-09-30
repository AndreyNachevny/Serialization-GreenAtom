import java.io.Serializable;

public class Person implements Serializable {

    private static final long SerialVersionUID = 1L;

    private String name;

    private int age;

    private transient String occupation;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation() {
        if (age >= 0 && age <=3){
            this.occupation = "stay at home";
        } else if (age > 3 && age <=7) {
            this.occupation = "goes to kindergarten";
        } else if (age > 7 && age <= 18) {
            this.occupation = "goes to school";
        } else if(age > 18 && age <= 23){
            this.occupation = "goes to university";
        } else if (age > 23 && age <=65) {
            this.occupation = "goes to work";
        } else if(age > 65){
            this.occupation = "retired";
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

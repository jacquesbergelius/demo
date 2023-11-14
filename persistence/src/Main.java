import java.io.*;
import java.util.ArrayList;

public class Main {
    private final static String FILENAME = "person.dat";
    public static void main(String[] args) {
        File f = new File(FILENAME);
        Person person = new Person();
        ArrayList<Person> person_list = new ArrayList<>();

        if (f.exists() && f.isFile()) {
            // we have objects state stored to the file, read it
            try (
                    FileInputStream inputstream = new FileInputStream(FILENAME);
                    ObjectInputStream objects = new ObjectInputStream(inputstream);
            ) {
                //person = (Person) objects.readObject();
                person_list = (ArrayList<Person>) objects.readObject();
            } catch (Exception e) {
                System.err.println("Reading person: " + e);
            }
        } else {
            // there are no stored object state, let's create an object
            person = new Person("Alfred", "Garcia", 2002);

            person_list.add(new Person("Aamos", "Kulikov", 2000));
            person_list.add(new Person("Philip", "TheGreat", 1990));
            person_list.add(new Person("Andy", "Garfield", 2010));

            try (
                    FileOutputStream outputstream = new FileOutputStream(FILENAME);
                    ObjectOutputStream objects = new ObjectOutputStream(outputstream);
            ) {
                objects.writeObject(person_list);
            } catch (Exception e) {
                System.err.println("Writing person: " + e);
            }
        }

        //System.out.println("Person: " + person);
        for (Person p : person_list)
            System.out.println(p);
    }
}
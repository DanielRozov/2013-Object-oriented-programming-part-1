
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> phoneBook;

    public Phonebook() {
        this.phoneBook = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.phoneBook.add(new Person(name, number));
    }

    public void printAll() {
        for (Person p : phoneBook) {
            System.out.println(p.toString());
        }
    }

    public String searchNumber(String name) {
        for (Person p : phoneBook) {
            if (p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        return "number not known";
    }
}

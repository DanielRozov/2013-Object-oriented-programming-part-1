
public class Main {

    public static void main(String[] args) {
        // write testcode here
        //Exercise 94.1: Person

//        Person pekka = new Person("Pekka Mikkola", "404-123123");
//
//        System.out.println(pekka);
//        pekka.changeNumber("050-333444");
//        System.out.println(pekka);
        //Exercise 94.2: Adding persons to Phonebook
        Phonebook phonebook = new Phonebook();
//
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");
//
//        phonebook.printAll();
//          Exercise 94.3: Searching for numbers from the phonebooks
        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println(number);

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println(number);
    }
}

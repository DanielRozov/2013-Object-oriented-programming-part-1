
public class Main {

    public static void main(String[] args) {
        // write test code here
//        Exercise 93.1: Calculating the age based on the birthday
//        Person pekka = new Person("Pekka", 15, 2, 1993);
//        Person steve = new Person("Thomas", 1, 3, 1955);
//
//        System.out.println(steve.getName() + " age " + steve.age()
//                + " years ");
//        System.out.println(pekka.getName() + " age " + pekka.age()
//                + " years ");
//
//        Exercise 93.2: Comparing ages based on birthdate Person pekka = new Person("Pekka", 15, 2, 1983);
//        Person martin = new Person("Martin", 1, 3, 1983);
//
//        System.out.println(martin.getName() + " is older than "
//                + pekka.getName() + ": " + martin.olderThan(pekka));
//        System.out.println(pekka.getName() + " is older than "
//                + martin.getName() + ": " + pekka.olderThan(martin));

        //Exercise 93.3: New constructors
        Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println(pekka);
        System.out.println(steve);
    }
}

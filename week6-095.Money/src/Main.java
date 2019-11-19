
public class Main {

    public static void main(String[] args) {
        // Test your code here!

//      Exercise 95.1: Plus
//      Money a = new Money(10, 0);
//      Money b = new Money(5, 0);
//
//      Money c = a.plus(b);
//
//      System.out.println(a);
//      System.out.println(b);
//      System.out.println(c);
//
//      a = a.plus(c);
//
//      System.out.println(a);
//      System.out.println(b);
//      System.out.println(c);


//      Exercise 95.2: less
//      Money a = new Money(10, 0);
//      Money b = new Money(3, 0);
//      Money c = new Money(5, 0);
//
//      System.out.println(a.less(b));
//      System.out.println(b.less(c));


//      Exercise 95.3: Minus
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
                                // the Money object 6.50e that variable c used to hold, is not referenced anymore
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);

    }
}

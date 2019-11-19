
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account A = new Account("A account", 100);
        Account B = new Account("B account", 0);
        Account C = new Account("C account", 0);
        
        transfer(A, B, 50.);
        transfer(B, C, 25.);
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    public static void transfer(Account from, Account to, double howMuch) {

        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}

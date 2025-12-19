import java.util.Scanner;
public class Main {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String surname1 = sc.nextLine();
        String name2 = sc.nextLine();
        String surname2 = sc.nextLine();

        Customer customer1 = new Customer(name1, surname1);
        Customer customer2 = new Customer(name2, surname2);
        customer2.setSurname("Curry");
        customer2.getSurname();

        double balance1 = sc.nextDouble();
        double balance2 = sc.nextDouble();

        Account account1 = new Account(balance1, customer1);
        Account account2 = new Account(balance2, customer2);

        System.out.println(account1.SameOwner(account2));

        Bank bank = new Bank("Halyk Bank");

        bank.AddAccount(account1);
        bank.AddAccount(account2);

        bank.printAccounts();
    }
}

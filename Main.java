public class Main {
    public static void main() {

        Customer customer1 = new Customer("Assylzhan", "Yussup");
        Customer customer2 = new Customer("Stephen", "Kurry");
        customer2.setSurname("Curry");
        customer2.getSurname();

        Account account1 = new Account(500.0, customer1);
        Account account2 = new Account(1200.5, customer2);

        System.out.println(account1.SameOwner(account2));

        Bank bank = new Bank("Halyk Bank");

        bank.AddAccount(account1);
        bank.AddAccount(account2);

        // Output to console
        bank.printAccounts();
    }
}

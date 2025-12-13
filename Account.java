public class Account {
    private int AccountId;
    private static int AccountId_gen = 1;
    private double balance;
    private Customer customer;

    Account(){
        AccountId = AccountId_gen++;
    }

    public Account(double balance, Customer customer) {
        this();
        setBalance(balance);
        setCustomer(customer);
    }

    public int getAccountId(){
        return AccountId;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account #" + AccountId +'\n'+ "Balance: " + balance +'\n'+ "Owner: " + customer.getName()+" "+customer.getSurname();
    }

    public boolean SameOwner(Account other) {
        return this.customer.equals(other.customer);
    }
}

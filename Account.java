public class Account {
    private int AccountId;
    private double balance;
    private Customer customer;

    public int getAccountId(){
        return AccountId;
    }

    public void setAccountId(int AccountId){
        this.AccountId = AccountId;
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
        return "Account #" + AccountId +'\n'+ ", Balance: " + balance +'\n'+ ", Owner: " + customer.getName()+" "+customer.getSurname();
    }
}

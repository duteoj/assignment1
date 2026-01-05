public class SavingAccount extends Account {

    public SavingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void applyInterest() {
        double interest = getBalance() * 0.05;
        setBalance(getBalance() + interest);
    }

    @Override
    public String toString() {
        return "Saving Account: " + super.toString();
    }
}

public class CurrentAccount extends Account {

    public CurrentAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void applyInterest() {
        double interest = getBalance() * 0.02;
        setBalance(getBalance() + interest);
    }

    @Override
    public String toString() {
        return "Current Account: " + super.toString();
    }
}

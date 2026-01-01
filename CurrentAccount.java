public class CurrentAccount extends Account {

    public CurrentAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void applyInterest() {
        // Применение процентов на баланс (например, 2% для Current Account)
        double interest = getBalance() * 0.02;
        setBalance(getBalance() + interest);
    }

    @Override
    public String toString() {
        return "Current Account: " + super.toString();
    }
}

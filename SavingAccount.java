public class SavingAccount extends Account {

    public SavingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void applyInterest() {
        // Применение процентов на баланс
        double interest = getBalance() * 0.05; // 5% годовых
        setBalance(getBalance() + interest);
    }

    @Override
    public String toString() {
        return "Saving Account: " + super.toString();
    }
}

public abstract class Account {
    private int accountId;
    private double balance;
    private String owner;

    protected Account(int accountID, String owner, double balance) {
        this.accountId = accountID;
        this.owner = owner;
        this.balance = balance;
    }

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public abstract void applyInterest();

    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Owner: " + owner + ", Balance: " + balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return accountId == account.accountId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(accountId);
    }
}

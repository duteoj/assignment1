public abstract class Account {
    private static int id_gen = 1;
    private int accountId;
    private double balance;
    private String owner;

    // Конструктор
    public Account(String owner, double balance) {
        this.accountId = id_gen++;
        this.owner = owner;
        this.balance = balance;
    }

    // Геттеры и сеттеры
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

    // Абстрактный метод для вычисления процентов
    public abstract void applyInterest();

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Owner: " + owner + ", Balance: " + balance;
    }

    // Переопределённый метод equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return accountId == account.accountId;
    }

    // Переопределённый метод hashCode()
    @Override
    public int hashCode() {
        return Integer.hashCode(accountId);
    }
}

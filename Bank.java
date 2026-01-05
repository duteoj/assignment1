import java.util.*;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void sortByBalance() {
        Collections.sort(accounts, Comparator.comparingDouble(Account::getBalance));
    }

    public Account findAccountByOwner(String owner) {
        for (Account account : accounts) {
            if (account.getOwner().equals(owner)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> filterAccountsByBalance(double minBalance) {
        List<Account> filteredAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getBalance() >= minBalance) {
                filteredAccounts.add(account);
            }
        }
        return filteredAccounts;
    }
    
    public void printAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
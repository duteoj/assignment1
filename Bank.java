import java.util.*;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Метод для сортировки аккаунтов по балансу
    public void sortByBalance() {
        Collections.sort(accounts, Comparator.comparingDouble(Account::getBalance));
    }

    // Метод для поиска аккаунтов по владельцу
    public Account findAccountByOwner(String owner) {
        for (Account account : accounts) {
            if (account.getOwner().equals(owner)) {
                return account;
            }
        }
        return null;
    }

    // Метод для фильтрации аккаунтов по балансу
    public List<Account> filterAccountsByBalance(double minBalance) {
        List<Account> filteredAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getBalance() >= minBalance) {
                filteredAccounts.add(account);
            }
        }
        return filteredAccounts;
    }

    // Метод для вывода всех аккаунтов
    public void printAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
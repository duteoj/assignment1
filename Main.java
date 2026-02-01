import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int id1 = sc.nextInt();
        String owner1 = sc.nextLine();
        double balance1 = sc.nextDouble();
        sc.nextLine();

        SavingAccount savingAccount = new SavingAccount(id1, owner1, balance1);
        bank.addAccount(savingAccount);

        int id2 = sc.nextInt();
        String owner2 = sc.nextLine();
        double balance2 = sc.nextDouble();
        sc.nextLine();

        CurrentAccount currentAccount = new CurrentAccount(id2, owner2, balance2);
        bank.addAccount(currentAccount);

        savingAccount.applyInterest();
        currentAccount.applyInterest();

 //       bank.sortByBalance();
 //       bank.printAccounts();

 //       Account foundAccount = bank.findAccountByOwner("Curry");
 //       if (foundAccount != null) {
 //           System.out.println("Found account: " + foundAccount);
 //       } else {
 //           System.out.println("Account not found.");
 //       }

 //       System.out.println();

 //       List<Account> filteredAccounts = bank.filterAccountsByBalance(1000);
 //       System.out.println("Accounts with balance >= 1000:");
 //       for (Account account : filteredAccounts) {
 //           System.out.println(account);
 //       }

        AccountDAO.insertAccount(savingAccount);
        AccountDAO.insertAccount(currentAccount);

        System.out.println("From database:");
        for (String s : AccountDAO.getAllAccounts()) {
            System.out.println(s);
        }

        AccountDAO.updateBalance(1, 999999);
        AccountDAO.deleteAccount(6);




    }
}

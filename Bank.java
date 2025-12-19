import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void AddAccount(Account account){
        accounts.add(account);
    }

    public void printAccounts(){
        for(Account a:accounts){
            System.out.println(a.toString());
        }
    }



}

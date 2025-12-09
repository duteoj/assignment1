import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String Name){
        this.name = Name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    publci void AddAccount(Account account){
        accounts.add(account);
    }

//suiiii

}

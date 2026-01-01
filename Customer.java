public class Customer {
    private String name;
    private String surname;
    private int id;
    private static int id_gen = 1;

    Customer(){
        id = id_gen++;
    }

    public Customer(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + surname;
    }

}

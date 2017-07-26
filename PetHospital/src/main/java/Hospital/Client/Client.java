package Hospital.Client;

public class Client extends Person{
    private Pet pet;

    public Client(String firstName, String lastName, Pet pet) {
        super(firstName, lastName);
        this.pet = pet;
    }

    public Client(String[] strings){
        super(strings[1], strings[2]);
    }
}
